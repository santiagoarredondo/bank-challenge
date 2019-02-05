package com.endava.bank;

public class Request {
    private String id;
    private String type;
    private double amount;
    Customer customer;

    public Request(String id, String type, double amount, Customer customer) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
