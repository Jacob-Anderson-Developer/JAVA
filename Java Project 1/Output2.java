/*   The purpose of this program is to accept user input in the form of strings and integers 
and to output the results to three separate lines using System.out.print.   */

/*Jacob Anderson
CIS 280
8-25-2022
*/



import java.util.Scanner;		//Needed to utilize the Scanner class

public class Output2
{
	public static void main(String[] args)
	{
	String name, major;
	int year;
	
	
	//Create Scanner Object that will allow input from keyboard.
	Scanner keyboard = new Scanner(System.in);
	
	//Greet User
	System.out.print("Welcome to College Information Display Program 2 -- Created By Jacob Anderson ");
	
	//Get the users name
	System.out.print("\nWhat is your name? ");
	name = keyboard.nextLine();
	
	//Get the users major
	System.out.print("What is your major? ");
	major = keyboard.nextLine();
	
	//Get users graduation year
	System.out.print("What is your expected graduation year? ");
	year = keyboard.nextInt();
	
	//Display user information
	System.out.println(" ");
	System.out.print("Your name is: " + name + "\nYour major is: " + major + "\nYour expected graduation year is: " + year);
	}
}