package com.endava.bank;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String email;
    private String id;
    private String name;
    private ArrayList<Request> lstRequests = new ArrayList<Request>();

    public Customer(String id, String name, String email, ArrayList<Request> lstRequests) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.lstRequests = lstRequests;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Request> getLstRequests() {
        return lstRequests;
    }

    public void setLstRequests(ArrayList<Request> lstRequests) {
        this.lstRequests = lstRequests;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", lstRequests=" + lstRequests +
                '}';
    }
}
