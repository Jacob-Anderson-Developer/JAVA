package ShipCost;

/* 11-3-2022
 * Jacob Anderson
 * CIS 280
 * ShipCost.java
 */


// This is the driver program for the Shipping Application
// Uses StandardShip, ExpressShip, and OverNightShip classes (all of which use the ShipCost interface)
// Compile and run as is to test
// Then, add the necessary code to validate the inputs:
//   -- do not accept anything other than 1, 2, or 3 for the shipping choice
//   -- do not accept zero or a negative number for the pounds
import java.util.*;

public class ShipCalculator {
	public static void main(String[] args) {
		int size = 0, choice = 0;
		int pounds = 0;
		boolean numError = true, poundError = true, sizeError = true;
		Scanner key = new Scanner(System.in);
		System.out.println("Shipping Calculator Application.  Altered by Jacob Anderson.\n");

		do {
			try {
				System.out.print("Enter number of pounds you are shipping as a whole number: ");
				pounds = key.nextInt();

				poundError = false;
			} catch (InputMismatchException e) {
				// Consumes integer input
				key.nextLine();
			}
		} while (poundError || pounds < 1);

		do {
			try {
				System.out.print("Enter 1 for Standard, 2 for Express, 3 for Overnight: ");
				choice = key.nextInt();
				numError = false;
			} catch (InputMismatchException e) {
				// Consumes integer input
				key.nextLine();
			}
		} while (numError || choice > 3 || choice < 1);

		ShipCost order = null;
		// creating a reference variable to the interface
		// Create the appropriate object and assign it to the Shipcost
		// reference--polymorphism
		if (choice == 1) {
			do {
				try {
					System.out.println("What size is your package? 1 = small 2 = medium 3 = large.");
					size = key.nextInt();
					order = new StandardShip(size);
					sizeError = false;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a number between 1 and 3.");
				}
			} while (sizeError || size < 0 || size > 3);
		
		} else if (choice == 2) {
			do {
				try {

					System.out.println("What size is your package? 1 = small 2 = medium 3 = large.");
					size = key.nextInt();
					order = new ExpressShip(size);
					sizeError = false;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a number between 1 and 3.");
				}
			} while (sizeError || size < 0 || size > 3);
		
		} else if (choice == 3) {
			order = new OvernightShip();
		}

		System.out.printf("Shipping Cost is $%.2f", order.calculateShipCost(pounds));
		key.close();
	}
}