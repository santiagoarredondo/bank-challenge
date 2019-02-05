package com.endava.bank;

public class Employee{
    private String name;
    private String id;
    private double salary;
    private boolean available;
    private Role role;

    public Employee(String id, String name, double salary, boolean available, Role role) {
        this.name=name;
        this.id=id;
        this.salary = salary;
        this.available = available;
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "{"+super.toString()+"}"+
                "salary=" + salary +
                ", available=" + available +
                ", role=" + role.toString() +
                '}';
    }

}
