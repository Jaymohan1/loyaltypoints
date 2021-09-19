package com.java.loyaltypoints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TierTest {

    @Test
    public void blueCustomerEarnsNoBonusPoints() {
        assertEquals(0, Tier.BLUE.calculateTotalPoints(99.99f));
        assertEquals(1, Tier.BLUE.calculateTotalPoints(100.00f));
        assertEquals(1, Tier.BLUE.calculateTotalPoints(199.99f));
        assertEquals(2, Tier.BLUE.calculateTotalPoints(200.00f));
    }

    @Test
    public void silverCustomerEarns15PercentBonusPointsAboveBlueCustomer() {
        assertEquals(0, Tier.SILVER.calculateTotalPoints(86.95f));
        assertEquals(1, Tier.SILVER.calculateTotalPoints(86.96f));
        assertEquals(1, Tier.SILVER.calculateTotalPoints(173.91f));
        assertEquals(2, Tier.SILVER.calculateTotalPoints(173.92f));
    }

    @Test
    public void goldCustomerEarns30PercentBonusPointsAboveBlueCustomer() {
        assertEquals(0, Tier.GOLD.calculateTotalPoints(76.92f));
        assertEquals(1, Tier.GOLD.calculateTotalPoints(76.93f));
        assertEquals(1, Tier.GOLD.calculateTotalPoints(153.84f));
        assertEquals(2, Tier.GOLD.calculateTotalPoints(153.85f));
    }

    @Test
    public void platinumCustomerEarns50PercentBonusPointsOverBlueCustomer() {
        assertEquals(0, Tier.PLATINUM.calculateTotalPoints(66.66f));
        assertEquals(1, Tier.PLATINUM.calculateTotalPoints(66.67f));
        assertEquals(1, Tier.PLATINUM.calculateTotalPoints(133.33f));
        assertEquals(2, Tier.PLATINUM.calculateTotalPoints(133.34f));
    }
}