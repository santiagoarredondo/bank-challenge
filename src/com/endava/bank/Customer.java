package com.endava.bank;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer extends Person{

    private String email;
    private ArrayList<Request> lstRequests = new ArrayList<Request>();

    public Customer(int id, String name, String email, ArrayList<Request> lstRequests) {
        super(id, name);
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

    @Override
    public String toString() {
        return "Customer{" +
                super.toString()+" "+
                "email='" + email + '\'' +
                ", lstRequests=" + lstRequests +
                '}';
    }
}
