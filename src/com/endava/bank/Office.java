package com.endava.bank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Office {
    private int id;
    private String country;
    private String city;
    private String address;
    private String currency;
    private Dispatcher dispatcher;

    public Office(int id, String country, String city, String address, String currency) {
        this.id = id;
        this.country = country;
        this.city = city;
        this.address = address;
        this.currency = currency;
        this.dispatcher = Dispatcher.getInstance();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Dispatcher getDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(Dispatcher dispatcher) {
        this.dispatcher = dispatcher;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }

    public void addRequest(String id, Customer customer, double amount, String type){
        Request request = new Request(id, type, amount, customer);
        this.dispatcher.getLstRequests().add(request);
        this.dispatcher.attend();
    }
}
