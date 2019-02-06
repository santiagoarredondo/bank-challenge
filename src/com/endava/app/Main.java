package com.endava.app;

import com.endava.bank.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    private static  void  sayHello(){
        System.out.println("Wellcome to the app");
    }

    private static void showMenuOptions(){
        System.out.println("Please choose an option:\n" +
                "1. Create Customer\n" +
                "2. Create show employees\n" +
                "3. Make a request\n" +
                "4. Exit");
    }

    private static void insertOption(){
        try {
            Scanner input = new Scanner(System.in);
            int option = input.nextInt();
            switch (option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            input.close();
        }catch (Exception e){
            System.err.println("You have to insert a number");
        }
    }

    public static void main(String[] args) {
        Office office = new Office("1234","Colombia", "Bogota","CR7 19 2", "COP");
        Role director = new Role("Director", 3);
        Role supervisor = new Role("Supervisor", 2);
        Role cashier = new Role("Cashier", 1);
        Employee e1 = new Employee("1","Andres",1400000,true, supervisor);
        Employee e2 = new Employee("2","Andrea",2400000,true, director);
        Employee e3 = new Employee("3","Miguel",1800000,true, cashier);
        office.getDispatcher().addEmployee(e1);
        office.getDispatcher().addEmployee(e2);
        office.getDispatcher().addEmployee(e3);
        office.addRequest("16546",new Customer("sar@gmail.com","83","JUAN"), 150000,"deposit");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("hola");
    }

}
