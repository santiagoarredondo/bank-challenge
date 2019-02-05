package com.endava.bank;

import java.util.ArrayList;
import java.util.Date;

public class Transaction {
    private String customerID;
    private String customerEmail;
    private String agentID;
    private String messageType;
    private String accountID;
    private Date date;
    private double value;
    private String type;
    private ArrayList<TransactionObserver> observers;

    public Transaction(String customerID, String customerEmail, String agentID, String messageType, String accountID, Date date, double value, String type) {
        this.customerID = customerID;
        this.customerEmail = customerEmail;
        this.agentID = agentID;
        this.messageType = messageType;
        this.accountID = accountID;
        this.date = date;
        this.value = value;
        this.type = type;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "customerID='" + customerID + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", agentID='" + agentID + '\'' +
                ", messageType='" + messageType + '\'' +
                ", accountID='" + accountID + '\'' +
                ", date=" + date +
                ", value=" + value +
                ", type='" + type + '\'' +
                '}';
    }
}
