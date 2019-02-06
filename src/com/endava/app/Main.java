package com.endava.app;

import com.endava.bank.*;

public class Main {

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
        office.getDispatcher().showRequestList();
    }

}
