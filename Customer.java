package loyaltyPoints;

public class Customer {
  private Tier tier;
  private int points;

  public Tier getTier() {
    return tier;
  }
  public void setTier(Tier tier) {
    this.tier = tier;
  }
  public int getPoints() {
    return points;
  }
  public void setPoints(int points) {
    this.points = points;
  }
}