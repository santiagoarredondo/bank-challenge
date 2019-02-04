package com.endava.bank;

public class Customer extends Person{

    private String email;
    private  Account account;
    private Dispatcher dispatcher;

    public Customer(int id, String name, String email, Account account, Dispatcher dispatcher) {
        super(id, name);
        this.email = email;
        this.account = account;
        this.dispatcher = dispatcher;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", account=" + account +
                '}';
    }

    public void chargeAccount(double value){
        this.account.charge(value);
    }

    public void discountAccount(double value){
        this.account.discount(value);
    }

    public void transferAccount(double value){
        this.account.transfer(value);
    }
}
