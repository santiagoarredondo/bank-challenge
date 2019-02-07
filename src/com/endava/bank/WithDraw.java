package com.endava.bank;

public class WithDraw implements Operation {
    @Override
    public boolean Operate(Transaction currentTransaction) {
        System.out.println("A withDrawl of  "+currentTransaction.getRequest().getAmount()+ "from the account of "+currentTransaction.getRequest().getCustomer().getEmail() +"has been execute");
        return true;
    }
}
