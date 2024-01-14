package Rent;
import java.util.Scanner;
/*
 * Jacob Anderson
 * CIS 280
 * 9-29-2022
 * 
 * The purpose of this program is to take user input and determine the cost of the users apartment based on the
 * parameters the user chooses.  Based on those inputs, the correlating array element will
 * show displaying the price.
 */





public class Rent {
	public static void main(String[] args) {

		double[][] apartment = { { 750.00, 850.00, 950.00, 1050.00 }, 
								 { 900.00, 1000.00, 1100.00, 1200.00 },
								 { 1075.00, 1175.00, 1275.00, 1375.00 } };
		int passer = 0, passer2 = -1, level, bedrooms = -1;
		String checker = "off";

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Welcome User
		System.out.println("Welcome to the Jacob Anderson Apartment Selector Program!");

		do {
			try {
				System.out.println("What level would you like to be on?");
				System.out.println("Type 1 for level 1 aka Garden Level");
				System.out.println("Type 2 for level 2 aka Basic");
				System.out.println("Type 3 for level 3 aka Deluxe");
				passer = keyboard.nextInt();
			} catch (Exception e) {
				checker = "on";
				// Consumes the return from the integer input
				keyboard.nextLine(); // Without this statement the while will continuously prompt user
										// Consumes the keyboard input to ensure this does not happen.
			}

		} while (passer != 1 && passer != 2 && passer != 3 && checker == "on");

		checker = "off";
		level = passer - 1;
		do {
			try {
				System.out.println("How many bedrooms would you like?");
				System.out.println("Type 0 for 0 bedrooms (Studio Aparment)");
				System.out.println("Type 1 for 1 bedroom");
				System.out.println("Type 2 for 2 bedrooms");
				System.out.println("Type 3 for 3 bedrooms");

				passer2 = keyboard.nextInt();
			} catch (Exception e) {
				checker = "on";
				// Consumes the return from the integer input
				keyboard.nextLine(); // Without this statement the while will continuously prompt user
										// Consumes the keyboard input to ensure this does not happen.
			}
		} while (passer2 != 0 && passer2 != 1 && passer2 != 2 && passer2 != 3 && checker == "on");

		checker = "off";
		bedrooms = passer2;
		System.out.println("An apartment on level " + passer + " with " + bedrooms + " bedroom(s) will cost $"
				+ apartment[level][bedrooms]);
		keyboard.close();
	}
}