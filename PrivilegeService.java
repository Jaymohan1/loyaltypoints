package loyaltyPoints;

public class PrivilegeService {
  private PointsCalculator pointsCalculator = new PointsCalculator();

  public int loyaltyPoints(Customer customer, float amountSpent) {
    Tier tier = customer.getTier();
    int newPoints = pointsCalculator.calculateTotalPoints(tier, amountSpent);
    int oldPoints = customer.getPoints();
    customer.setPoints(oldPoints + newPoints);
    return customer.getPoints();
  }

  // Other public methods
  // Tier updateTier(Customer customer) {
  // ...
}