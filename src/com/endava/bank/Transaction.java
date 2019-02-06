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
        observers = new ArrayList<TransactionObserver>();
        observers.add(Auditor.getInstance());
        observers.add(MessageManager.getInstance());
        notifyObservers();
    }

    public boolean operate(){
        System.out.println(this.request.toString());
        if(request.getType().equalsIgnoreCase("deposit")){
            Deposit deposit = new Deposit();
            return  deposit.Operate(this);
        }
        else if(request.getType().equalsIgnoreCase("withdraw")){
            WithDraw withDraw= new WithDraw();
            return  withDraw.Operate(this);
        }
        else if(request.getType().equalsIgnoreCase("resolveissue")){
            ResolveIssue resolveIssue = new ResolveIssue();
            return  resolveIssue.Operate(this);
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

    private void notifyObservers(){
        for(TransactionObserver concreteObserver: observers){
            concreteObserver.update(this);
        }
    }


}
