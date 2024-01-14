/*   The purpose of this program is to accept user input for the number of credits in a course, 
the name of the course, and then calculate and display the projected hours of study required for the course.   */

/*Jacob Anderson
CIS 280
8-25-2022
*/

import java.util.Scanner;		//Needed to utilize the Scanner class

public class Study
{
	public static void main(String[] args)
	{
	String name;
	int credits, multiplier = 3, studyHours;
	
	
	//Create Scanner Object that will allow input from keyboard.
	Scanner keyboard = new Scanner(System.in);
	
	//Greet User
	System.out.print("Welcome to College Study Hour Calculator -- Created By Jacob Anderson ");
	
	//Get course credit count
	System.out.print("\nHow many credits does the course have? ");
	credits = keyboard.nextInt();
	
	//Consumes the return from the integer input
	keyboard.nextLine();
	//evt.consume();
	
	//Get the course name
	System.out.print("What is the name of the course? ");
	name = keyboard.nextLine();
	
	studyHours = credits * multiplier;
	
	//Display user information
	System.out.println(" ");
	System.out.println("You should expect to spend " + studyHours + " hours each week studying for " + name + ", plan ahead.");
	}
}