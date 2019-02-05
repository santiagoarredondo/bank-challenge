package com.endava.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;

public class Dispatcher {

    private static final Dispatcher instance = new Dispatcher();

    private ArrayList<Employee> lstEmployees = new ArrayList<Employee>();

    private Queue<Request> lstRequests = new LinkedList<>();

    public static Dispatcher getInstance(){
        return Dispatcher.instance;
    }

    public void attend() {
        Employee employee = firstAvailable();
        if (employee.equals(null)) {
            System.err.println("There's no one available");
        }
        else{
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            employee.setAvailable(false);
            Transaction transaction = new Transaction(lstRequests.remove(),employee, date);
            boolean bool = transaction.operate();
        }
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

    public ArrayList<Employee> getLstEmployees() {
        return lstEmployees;
    }

    public Queue<Request> getLstRequests() {
        return lstRequests;
    }

    public void setLstRequests(Queue<Request> lstRequests) {
        this.lstRequests = lstRequests;
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
