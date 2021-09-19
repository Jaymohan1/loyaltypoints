package com.java.loyaltypoints;

public class PrivilegeService {

    public int loyaltyPoints(Customer customer, float amountSpent) {
        return customer.loyaltyPoints(amountSpent);
    }
}