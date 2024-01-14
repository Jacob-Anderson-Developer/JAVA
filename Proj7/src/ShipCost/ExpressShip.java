package ShipCost;
/*
 * 11-3-2022
 * Jacob Anderson
 * CIS 280
 * ExpressShip.java
 * 
 * This class implements the ShipCost interface and Overrides its method to determine the shipping cost
 * for this class of package.
 */

public class ExpressShip implements ShipCost

{
	int eSize, ePounds;
	
	public ExpressShip(int size) 
	{
		eSize = size;
	}
	
	@Override
	public double calculateShipCost(int pounds) {
		double totalCost = 0.0;

		if (eSize == 1) {
			totalCost = 10 + (pounds * 8);
		} else if (eSize == 2) {
			totalCost = 10 + (pounds * 11);
		} else if (eSize == 3) {
			totalCost = 10 + (pounds * 13);
		}
		return totalCost;
	}
}