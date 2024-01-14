/*
CIS 280
Jacob Anderson
9-15-2022

The purpose of this program is to demonstrate knowledge of loops and validation.  A user is to enter a number between 101 and 199.  If the user fails to do so, they will be prompted to enter the correct information again.

*/
import java.util.Scanner;	
import javax.swing.*;

public class ProcessGrades
{
  public static void main (String args[])
  {
    // variables
	int grade = 0, pass = 0, fail =0, sum = 0, avg;
	char letterGrade = 'E', answer = 'E';
	
	//Create Scanner Object that will allow input from keyboard.
	Scanner keyboard = new Scanner(System.in);
	
	//Welcome User
	System.out.print("Welcome to the Jacob Anderson Grade Processing Program!");
	
	
	//Begin Loop
	do
	{
		System.out.print("\nPlease enter the grade you received as a percentage between 0 and 100 ");
		grade = keyboard.nextInt();
	
		//Consumes the return from the integer input
		keyboard.nextLine();
		
		//While the data is invalid, continue to run the following loop
		while (grade <0 || grade > 100) 
		{
			System.out.print("\nPlease enter the grade you received as a percentage between 0 and 100 ");
			grade = keyboard.nextInt();
		}
		
		if (grade >= 90)
		{
			letterGrade = 'A';
			System.out.print( "\nLetter Grade: "+ letterGrade);
			pass++;
			sum = sum + grade;
		}
		
		else if (grade >= 80)
		{
			letterGrade = 'B';
			System.out.print( "\nLetter Grade: "+ letterGrade);
			pass++;
			sum = sum + grade;
		}
		else if (grade >= 70)
		{
			letterGrade = 'C';
			System.out.print( "\nLetter Grade: " + letterGrade);
			pass++;
			sum = sum + grade;
		}
		else if (grade >= 60)
		{
			letterGrade = 'D';
			System.out.print( "\nLetter Grade: " + letterGrade);
			pass++;
			sum = sum + grade;
		}
		else
		{
			letterGrade = 'E';
			System.out.print( "\nLetter Grade: " + letterGrade);
			fail++;
			sum = sum + grade;
		}
			
			//Ask user if they would like to continue
			System.out.print( "\nWould you like to continue? (y/n): ");
			answer = keyboard.next().charAt(0);
			
	} while (answer == 'y' || answer == 'Y');
	
	avg = sum / (pass+fail);
	
System.out.print( "\nNumber of passing grades " + pass);
System.out.print( "\nNumber of failing grades " + fail);
System.out.print( "\nYour average grade is: " + avg);

   }
}
    



