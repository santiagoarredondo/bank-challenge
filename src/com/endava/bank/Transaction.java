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
    }

    public boolean operate(){
        boolean state = false;
        if(request.getType().equalsIgnoreCase("deposit")){
            Deposit deposit = new Deposit();
            state = deposit.Operate(this);
        }
        else if(request.getType().equalsIgnoreCase("withdraw")){
            WithDraw withDraw= new WithDraw();
            state = withDraw.Operate(this);
        }
        else if(request.getType().equalsIgnoreCase("resolveissue")){
            ResolveIssue resolveIssue = new ResolveIssue();
            state = resolveIssue.Operate(this);
        }
        else{
            state = false;
        }
        registerObservers();
        return state;
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

    private void registerObservers(){
        observers.add(Auditor.getInstance());
        observers.add(MessageManager.getInstance());
        notifyObservers();
    }

    private void notifyObservers(){
        for(TransactionObserver concreteObserver: observers){
            concreteObserver.update(this);
        }
    }


}
