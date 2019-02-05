package com.endava.bank;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private Request request;
    private Employee employee;
    private Date date;
    private ArrayList<TransactionObserver> observers;

    public Transaction(Request request, Employee employee, Date date) {
        this.request = request;
        this.employee = employee;
        this.date = date;
        //TODO: Observer insert observer services
    }

    public boolean operate(){
        if(request.getType().equals("deposit")){
            Deposit deposit = new Deposit();
            return  deposit.Operate();
        }
        else if(request.getType().equals("withdraw")){
            WithDraw withDraw= new WithDraw();
            return  withDraw.Operate();
        }
        else if(request.getType().equals("resolveissue")){
            ResolveIssue resolveIssue = new ResolveIssue();
            return  resolveIssue.Operate();
        }
        else
            return  false;
    }

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

    @Override
    public String toString() {
        return "Transaction{" +
                "request=" + request +
                ", employee=" + employee +
                ", date=" + date +
                ", observers=" + observers +
                '}';
    }
}
