package com.endava.bank;


public class MessageManager implements TransactionObserver {
    private static MessageManager uniqueInstance;

    public MessageManager() {}

    public static synchronized MessageManager getInstance(){
        if (uniqueInstance == null ){
            uniqueInstance = new MessageManager();
        }
        return uniqueInstance;
    }

    @Override
    public void  update(Transaction currentTransaction){
        MktServiceConcret mktservice = new MktServiceConcret();
        Customer customer = currentTransaction.getRequest().getCustomer();
        mktservice.updateInformation(customer.getId(), currentTransaction.getRequest().getAmount(),customer.getEmail());;
    };
}
