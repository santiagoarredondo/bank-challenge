package com.endava.bank;

public class ResolveIssue implements Operation {
    @Override
    public boolean Operate(Transaction currentTransaction) {
        System.out.println("The issue of" + currentTransaction.getRequest().getCustomer().getEmail() + "has been attend");
        return true;
    }
}
