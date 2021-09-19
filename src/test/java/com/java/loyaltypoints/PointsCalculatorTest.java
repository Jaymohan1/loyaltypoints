package com.java.loyaltypoints;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointsCalculatorTest {

    private PointsCalculator calculator = new PointsCalculator();

    @Test
    public void blueCustomerEarnsNoBonusPoints() {
        assertEquals(0, calculator.calculateTotalPoints(Tier.BLUE, 99.99f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.BLUE, 100.00f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.BLUE, 199.99f));
        assertEquals(2, calculator.calculateTotalPoints(Tier.BLUE, 200.00f));
    }

    @Test
    public void silverCustomerEarns15PercentBonusPointsAboveBlueCustomer() {
        assertEquals(0, calculator.calculateTotalPoints(Tier.SILVER, 86.95f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.SILVER, 86.96f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.SILVER, 173.91f));
        assertEquals(2, calculator.calculateTotalPoints(Tier.SILVER, 173.92f));
    }

    @Test
    public void goldCustomerEarns30PercentBonusPointsAboveBlueCustomer() {
        assertEquals(0, calculator.calculateTotalPoints(Tier.GOLD, 76.92f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.GOLD, 76.93f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.GOLD, 153.84f));
        assertEquals(2, calculator.calculateTotalPoints(Tier.GOLD, 153.85f));
    }

    @Test
    public void platinumCustomerEarns50PercentBonusPointsOverBlueCustomer() {
        assertEquals(0, calculator.calculateTotalPoints(Tier.PLATINUM, 66.66f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.PLATINUM, 66.67f));
        assertEquals(1, calculator.calculateTotalPoints(Tier.PLATINUM, 133.33f));
        assertEquals(2, calculator.calculateTotalPoints(Tier.PLATINUM, 133.34f));
    }
}