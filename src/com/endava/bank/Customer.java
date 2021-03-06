package com.endava.bank;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String email;
    private String id;
    private String name;
    private String accountId;

    public Customer(String email, String id, String name, String accountId) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", accountId='" + accountId + '\'' +
                '}';
    }
}
