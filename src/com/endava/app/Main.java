package com.endava.app;

import com.endava.bank.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {


    public static void main(String[] args) {
        Dispatcher dispatcher = Dispatcher.getInstance();
        Role director = new Role("Director", 3);
        Role supervisor = new Role("Supervisor", 2);
        Role cashier = new Role("Cashier", 1);


//        Employee e1 = new Employee(1,"Andres",1400000,true, supervisor);
//        Employee e2 = new Employee(2,"Andrea",2400000,true, director);
//        Employee e3 = new Employee(3,"Miguel",1800000,true, cashier);
//        dispatcher.addEmployee(e1);
//        dispatcher.addEmployee(e2);
//        dispatcher.addEmployee(e3);
//        System.out.println(dispatcher.attend().toString());

    }

}
