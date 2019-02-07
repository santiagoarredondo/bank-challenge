package com.endava.bank;

public class MktServiceConcret extends MktService {

    public MktServiceConcret() {

    }

    @Override
    public void sendAD(String CustomerID, String email) {
        System.out.println("Sending advertising to: " + CustomerID + " -- " + email);
    }
}
