package com.java.loyaltypoints;

public class PrivilegeService {
    private final PointsCalculator pointsCalculator = new PointsCalculator();

    public int loyaltyPoints(Customer customer, float amountSpent) {
        return customer.loyaltyPoints(amountSpent, pointsCalculator);
    }
}