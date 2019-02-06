package com.endava.bank;

public interface TransactionObserver {
    void  update(Transaction currentTransaction);
}
