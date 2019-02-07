package com.endava.app;

import com.endava.bank.Customer;
import com.endava.bank.Office;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

public class AddQuest implements  Runnable {
    private Office office;
    private String id;
    private String type;
    private double amount;
    Customer customer;

    public AddQuest(Office office, String id, String type, double amount, Customer customer) {
        this.office = office;
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.customer = customer;
    }

    public void run() {
        office.addRequest(id,customer,amount,type);
    }

    @Override
    public String toString() {
        return "AddQuest{"  +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", customer=" + customer +
                '}';
    }
}
