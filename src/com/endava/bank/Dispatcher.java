package com.endava.bank;

import java.util.ArrayList;

public class Dispatcher {

    private static final Dispatcher instance = new Dispatcher();

    private ArrayList<Employee> lstEmployees = new ArrayList<Employee>();

    public static Dispatcher getInstance(){
        return Dispatcher.instance;
    }

    public Employee attend() {
        Employee employee = firstAvailable();
        if (employee.equals(null)) {
            System.err.println("There's no one available");
            return null;
        }
        return employee;
    }

    private Employee firstAvailable(){
        int min = Integer.MAX_VALUE;
        Employee selection = null;
        for (Employee e: lstEmployees) {
            if (e.getRole().getPriority()<min){
                selection = e;
                min=e.getRole().getPriority();
            }
        }
        return selection;
    }

    public void setLstEmployees(ArrayList<Employee> lstEmployees) {
        this.lstEmployees = lstEmployees;
    }

    public void addEmployee(Employee e){
        lstEmployees.add(e);
    }

    public void removeEmployee(Employee e){
        lstEmployees.remove(e);
    }
}
