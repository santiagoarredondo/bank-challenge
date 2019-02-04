package com.endava.bank;

public class Transaction {
    private int id;
    private String type;
    private String description;
    private double value;
    private Employee employee;
    private Customer customer;

    public Transaction(int id, String type, String description, double value, Employee employee, Customer customer) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.value = value;
        this.employee = employee;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                ", employee=" + employee +
                ", customer=" + customer +
                '}';
    }
}
