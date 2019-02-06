package com.endava.bank;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Auditor implements TransactionObserver {

    private static Auditor uniqueInstance;
    private static double maxDepositAmount =10000;

    public static double getMaxDepositAmount() {
        return maxDepositAmount;
    }

    public static void setMaxDepositAmount(double maxDepositAmount) {
        Auditor.maxDepositAmount = maxDepositAmount;
    }

    public Auditor() {
    }

    public static synchronized Auditor getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Auditor();
        }
        return uniqueInstance;
    }

    public void reviewDeposits(Transaction currentTransaction){
        if (currentTransaction.getRequest().getType().equalsIgnoreCase("DEPOSIT")&&(currentTransaction.getRequest().getAmount() > maxDepositAmount)) {
            String transactionDescription=currentTransaction.getRequest().getCustomer().getId()+","+currentTransaction.getRequest().getCustomer().getAccountId()+","+currentTransaction.getRequest().getAmount();
            String fileName=getFileName(currentTransaction.getDate());
            writeTransactionDescription(transactionDescription,fileName);
        }
    }

    public void actions(Transaction currentTransaction){
        reviewDeposits(currentTransaction);

    }

    @Override
   public void update(Transaction currentTransaction){
       actions(currentTransaction);
    }

    public void writeTransactionDescription(String transactionDescription,String fileName){

        File tempFile = new File(fileName);
        boolean exists = tempFile.exists();
        String newTransaction=transactionDescription + "\n";

       if (exists){

           try{
               Files.write(Paths.get(fileName), newTransaction.getBytes(), StandardOpenOption.APPEND);

           }
           catch(IOException e){
               e.printStackTrace();
           }

       }
       else{

           try{

               File file = new File(fileName);
               file.createNewFile();
               FileWriter fw = new FileWriter(file);
               BufferedWriter bw = new BufferedWriter(fw);
               bw.write(newTransaction);
               bw.flush();
               bw.close();



           }catch(IOException e){
               e.printStackTrace();
           }
       }


    }

    public  String getFileName(Date transactionDate){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
        String fileName = "DEPOSITSTOREVIEW-"+dateFormat.format(transactionDate)+".txt";
        return fileName;
    }
}
