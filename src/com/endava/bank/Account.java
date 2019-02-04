package com.endava.bank;

public class Account {

    private int id;
    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }

    public void charge(double value){
        this.balance+=value;
    }

    public void discount(double value){
        if (this.balance<value){
            System.err.println("There's not enough balance in this account");
            return;
        }
        this.balance-=value;
    }

    public double transfer(double value){
        if (this.balance<value){
            System.err.println("There's not enough balance in this account");
        }
        this.balance-=value;
        return this.balance;
    }
}
