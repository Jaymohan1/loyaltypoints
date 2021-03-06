package com.java.loyaltypoints;

public class Customer {
    private Tier tier;
    private int points;

    public Customer(Tier tier, int points) {
        this.tier = tier;
        this.points = points;
    }

    public int loyaltyPoints(float amountSpent) {
        int newPoints = tier.calculateTotalPoints(amountSpent);
        points = points + newPoints;
        return points;
    }
}