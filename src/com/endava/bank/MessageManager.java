package com.endava.bank;


public class MessageManager implements TransactionObserver {

    @Override
    public void  update(Transaction currentTransaction){
        MktServiceConcret mktservice = new MktServiceConcret();
        Customer customer = currentTransaction.getRequest().getCustomer();
        mktservice.updateInformation(customer.getId(), currentTransaction.getRequest().getAmount(),customer.getEmail());;
    };
}
