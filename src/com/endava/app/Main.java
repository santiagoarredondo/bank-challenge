package com.endava.app;

import com.endava.bank.*;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Office office = new Office("1234","Colombia", "Bogota","CR7 19 2", "COP");
        Role director = new Role("Director", 3);
        Role supervisor = new Role("Supervisor", 2);
        Role cashier = new Role("Cashier", 1);
        Employee e1 = new Employee("1","Andres",1400000,true, supervisor);
        Employee e4 = new Employee("4","Yeison",3000000,true, cashier);
        Employee e2 = new Employee("2","Andrea",2400000,true, director);
        Employee e3 = new Employee("3","Miguel",1800000,true, cashier);
        office.getDispatcher().addEmployee(e1);
        office.getDispatcher().addEmployee(e2);
        office.getDispatcher().addEmployee(e3);
        office.getDispatcher().addEmployee(e4);


        Runnable app = new AddQuest(office,"00001","deposit",15000,new Customer("juan.lp@gmail.com","1","JUAN","10000"));
        Thread thread1 = new Thread(app);
        thread1.start();
        sleep(1000);

        Runnable app2 = new AddQuest(office,"00002","withdraw",250,new Customer("alejandro.lp@gmail.com","2","ALEJANDRO","20000"));
        Thread thread2 = new Thread(app2);
        thread2.start();
        sleep(1000);

        Runnable app3 = new AddQuest(office,"00003","deposit",3500,new Customer("yeison@gmail.com","3","YEISON","30000"));
        Thread thread3 = new Thread(app3);
        thread3.start();
        sleep(1000);

        Runnable app4 = new AddQuest(office,"00004","deposit",45000,new Customer("melanie@gmail.com","4","MELANIE","40000"));
        Thread thread4 = new Thread(app4);
        thread4.start();
        sleep(1000);

        Runnable app5 = new AddQuest(office,"00005","issue",0,new Customer("carlos@gmail.com","5","CARLOS","50000"));
        Thread thread5 = new Thread(app5);
        thread5.start();
        sleep(1000);

        Runnable app6 = new AddQuest(office,"00006","deposit",15000,new Customer("pedro@gmail.com","6","PEDRO","60000"));
        Thread thread6 = new Thread(app6);
        thread6.start();
        sleep(1000);

        Runnable app7 = new AddQuest(office,"00007","deposit",2,new Customer("sara@gmail.com","7","SARA","70000"));
        Thread thread7 = new Thread(app7);
        thread7.start();
        sleep(1000);

        Runnable app8 = new AddQuest(office,"00008","WITHDRAW",35000,new Customer("jesica@gmail.com","8","JESICA","80000"));
        Thread thread8 = new Thread(app8);
        thread8.start();
        sleep(1000);

        Runnable app9 = new AddQuest(office,"00009","deposit",4500,new Customer("lina@gmail.com","9","LINA","90000"));
        Thread thread9 = new Thread(app9);
        thread9.start();
        sleep(1000);

        Runnable app10 = new AddQuest(office,"00010","deposit",55000,new Customer("miguel@gmail.com","10","MIGUEL","100000"));
        Thread thread10 = new Thread(app10);
        thread10.start();
        sleep(1000);


    }

}
