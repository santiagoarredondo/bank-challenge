package com.endava.bank;

public class Deposit implements Operation {
    @Override
    public boolean  Operate(Transaction currentTransaction) {
        System.out.println(currentTransaction.getRequest().getAmount() + " has been deposited, in the account of "+currentTransaction.getRequest().getCustomer().getEmail() );
        return true;
    }
}
