/*   The purpose of this program is to allow a user to enter how many credits they are registered for, then calculate the 
tuition along with fees based on those credits, and finally to display the costs associated with the semester as well as 
displaying the amount of credits taken.  */


/*Jacob Anderson
CIS 280
8-25-2022
*/

import java.util.Scanner;		//Needed to utilize the Scanner class
import javax.swing.JOptionPane; //Allows for dialog boxes to be used

public class Tuition
{
	public static void main(String[] args)  //Method header
	{
	
	int credits;
	final double TUITION_RATE = 503.95, facilityFee = 10.00, parkingFee = 60.75, registrationFee = 45.00;
	double tuitionRateTot, facilityFeeTot, parkingFeeTot, registrationFeeTot, tuitionTot;
	String jimp;
	
	
	//Create Scanner Object that will allow input from keyboard.
	Scanner keyboard = new Scanner(System.in);
	
	//Greet User
	System.out.print("Welcome to the Tuition Cost Calculator -- Created By Jacob Anderson ");
	
	
	//Get amount of credits being taken by the user
	System.out.print("\nHow many credits are you taking this semester? ");
	credits = keyboard.nextInt();
	
	//Calculate Credits
	
	tuitionRateTot = TUITION_RATE * credits;
	facilityFeeTot = facilityFee;
	parkingFeeTot = parkingFee;
	registrationFeeTot = registrationFee;
	
	tuitionTot = tuitionRateTot + facilityFeeTot + parkingFeeTot + registrationFeeTot;
	
	// Display the total number of credits, tuition amount, facility fee, parking fee, registration fee, and the 
	//total owed. Demonstrate the use of both System.out.printf and String.format in your solution
	
	System.out.printf("\n");
	System.out.printf("The total credits taken this semester is " + credits);
	System.out.printf("\nThe total tuition for this semester is $%,.2f", tuitionRateTot);
	System.out.printf("\nThe total facility fee for this semester is $%,.2f", facilityFeeTot);
	System.out.printf("\nThe total parking fee for this semester is $%,.2f", parkingFeeTot);
	System.out.printf("\nThe total registration fee for this semester is $%,.2f", registrationFeeTot);
	
	
	jimp = String.format("The total cost for this semester is: $%,.2f", tuitionTot);
	System.out.printf("\n");
	System.out.printf(jimp);
	
	
	System.exit(0);
	}
}