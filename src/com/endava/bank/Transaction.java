package com.endava.bank;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private Customer customer;
    private Employee employee;
    private Date date;
    private double value;
    private String type;
    private ArrayList<TransactionObserver> observers;


}
