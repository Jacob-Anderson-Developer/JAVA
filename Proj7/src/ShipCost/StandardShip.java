package ShipCost;

/*
 * 11-3-2022
 * Jacob Anderson
 * CIS 280
 * ShipCost.java
 * This class implements the ShipCost interface and Overrides its method to determine the shipping cost
 * for this class of package.
 */

public class StandardShip implements ShipCost

{
	int eSize, ePounds;

	public StandardShip(int size) {
		eSize = size;
	}

	@Override
	public double calculateShipCost(int pounds) {
		double totalCost = 0.0;

		if (eSize == 1) {
			totalCost = pounds * 7;
		} else if (eSize == 2) {
			totalCost = pounds * 10;
		} else if (eSize == 3) {
			
			totalCost = pounds * 12;
		}
		return totalCost;
	}
}
	