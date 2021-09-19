package loyaltyPoints;

public class PointsCalculator {
  private static float AMOUNT_PER_POINT = 100.00f;
	
  public int calculateTotalPoints(Tier tier, float amountSpent) {
    final float earnedPoints = earnedPoints(amountSpent);
    return (int)(earnedPoints + bonus(tier, earnedPoints));
  }

  private float earnedPoints(float amountSpent) {
    return amountSpent / AMOUNT_PER_POINT;
  }

  private float bonus(Tier tier, float earnedPoints) {
    if (tier == Tier.SILVER) {
      return 0.15f * earnedPoints;
    }
    if (tier == Tier.GOLD) {
      return 0.3f * earnedPoints;
    }
    if (tier == Tier.PLATINUM) {
      return 0.5f * earnedPoints;
    }
    return 0f;
  }
}