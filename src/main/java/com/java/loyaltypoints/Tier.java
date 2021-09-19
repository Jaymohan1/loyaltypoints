package com.java.loyaltypoints;

enum Tier {
    PLATINUM(0.5f), GOLD(0.3f), SILVER(0.15f), BLUE(0f);

    private final float factor;
    private static final float AMOUNT_PER_POINT = 100.00f;


    Tier(float factor) {
        this.factor = factor;
    }

    public float bonus(float earnedPoints) {
        return this.factor * earnedPoints;
    }

    public int calculateTotalPoints(float amountSpent) {
        final float earnedPoints = amountSpent / AMOUNT_PER_POINT;
        return (int) (earnedPoints + bonus(earnedPoints));
    }
}