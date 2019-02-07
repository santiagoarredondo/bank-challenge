package com.endava.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static java.lang.Thread.sleep;

public class Dispatcher {

    private static final Dispatcher instance = new Dispatcher();

    private ArrayList<Employee> lstEmployees = new ArrayList<Employee>();

    private Queue<Request> lstRequests = new LinkedList<>();

    public static Dispatcher getInstance(){
        return Dispatcher.instance;
    }

    public void attend() {
        if(!lstEmployees.isEmpty()) {
            Employee employee = firstAvailable();
            if (employee == null) {
                System.err.println("There's no one available");
                try {
                    sleep(5000);
                    attend();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                employee.setAvailable(false);
                DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                Transaction transaction = new Transaction(lstRequests.remove(), employee, date);
                Random time = new Random();
                int number = time.nextInt(5000) + 10000;
                System.out.println("I'll attend the " + transaction.getRequest().getId() + " request with " + employee.getName() + " employee. " +
                        "Time to attend: " + number + " ms");

                boolean bool = transaction.operate();
                if (bool) {
                    try {
                        sleep(number);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    employee.setAvailable(true);
                    System.out.println("\033[1;32m"+"I finished the " + transaction.getRequest().getId()+"\033[0m");

                }
            }
        }
    }

    private Employee firstAvailable(){
        int min = Integer.MAX_VALUE;
        Employee selection = null;
        for (Employee e: lstEmployees) {
            if (e.getRole().getPriority()<min && e.isAvailable()){
                selection = e;
                min=e.getRole().getPriority();
            }
        }
        return selection;
    }

    public Queue<Request> getLstRequests() {
        return lstRequests;
    }

    public  void  addRequest(Request request){
        lstRequests.add(request);
        this.attend();
    }

    public void addEmployee(Employee e){
        lstEmployees.add(e);
    }

    public void removeEmployee(Employee e){
        lstEmployees.remove(e);
    }

}
