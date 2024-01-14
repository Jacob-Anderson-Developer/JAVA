package ShipCost;
/*
 * 11-3-2022
 * Jacob Anderson
 * CIS 280
 * OvernightShip.java
 * 
 * This class implements the ShipCost interface and Overrides its method to determine the shipping cost
 * for this class of package.
 */
public class OvernightShip implements ShipCost

{
	
	@Override
	public double calculateShipCost(int pounds) 
	{
		double totalCost = 0.0;
		totalCost = 15 + (15 * pounds);
		return totalCost;
	}
}