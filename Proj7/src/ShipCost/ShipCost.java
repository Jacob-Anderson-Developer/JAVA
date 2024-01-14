package ShipCost;
/*
 * 11-3-2022
 * Jacob Anderson
 * CIS 280
 * ShipCost.java
 * 
 * This is the interface for ShipCost, which will allow other classes to implement it and override 
 * its calculateShipCost method.
 */
public interface ShipCost
{
	public double calculateShipCost(int pounds);
}