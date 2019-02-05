package com.endava.bank;

import java.util.ArrayList;
import java.util.Date;
public class Transaction {
    private Request request;
    private Employee employee;
    private Date date;
    private ArrayList<TransactionObserver> observers;

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }



    public ArrayList<TransactionObserver> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<TransactionObserver> observers) {
        this.observers = observers;
    }

    public Transaction(Request request, Employee employee, Date date, String type, ArrayList<TransactionObserver> observers) {
        this.request = request;
        this.employee = employee;
        this.date = date;
        this.observers = observers;
    }
}