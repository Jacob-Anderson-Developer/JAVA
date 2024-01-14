/*  The purpose of this program is to demonstrate the instantiation of an object through a no arg constructor, set and get methods, and passing parameters into the object.   */
/*  This is the driver file that moves the program forward and creates the objects from the class files specs  */

/*Jacob Anderson
CIS 280
8-30-2022
*/

import java.util.Scanner;		
			
			public class DemoStudent
			{
				//Begin Main
				public static void main(String[] args)
				{

					int credTak, studHour;
					String lName, fName, mjr, stuNo;
					
					System.out.println(" ");
					System.out.println("Welcome to the Jacob Anderson College Study Time Calculator!");
					
	
					//Instantiate a student object
					Student firstStudent = new Student();  //Create Student object
					
					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the new student");
					System.out.println("Student Number: "  + firstStudent.getStudentNumber());
					System.out.println("Credits: "  + firstStudent.getCredits());
					System.out.println("Last Name: "  + firstStudent.getLastName());
					System.out.println("First Name: "  + firstStudent.getFirstName());
					System.out.println("Major: "  + firstStudent.getMajor());
					System.out.println("Hours you should be studying a week: "  + firstStudent.getHours());
					
					
					
					//Instantiate a student object
					Student secondStudent = new Student("0223603", 3, "Jacob", "Anderson", "CIS");  //Create Student object

					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the new student");
					System.out.println("Student Number: "  + secondStudent.getStudentNumber());
					System.out.println("Credits: "  + secondStudent.getCredits());
					System.out.println("Last Name: "  + secondStudent.getLastName());
					System.out.println("First Name: "  + secondStudent.getFirstName());
					System.out.println("Major: "  + secondStudent.getMajor());
					System.out.println("Hours you should be studying a week: "  + secondStudent.getHours());
					

					
					//Instantiate a student object
					Student thirdStudent = new Student();  //Create Student object
					
					
					//Create Scanner object for keyboard input
					Scanner keyboard = new Scanner(System.in);
					
					//Accept User input to define fields		
					
					System.out.println(" ");
					System.out.print("What is your student number?");
					stuNo = keyboard.nextLine();
					
					System.out.print("How many credits are you taking?");
					credTak = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					
					System.out.print("What is your last name?");
					lName = keyboard.nextLine();
					
					System.out.print("What is your first name?");
					fName = keyboard.nextLine();
					
					System.out.print("What is your major?");
					mjr = keyboard.nextLine();		
	

					//Call the set methods to define the variables
					thirdStudent.setStudentNumber(stuNo);
					thirdStudent.setCredits(credTak);
					thirdStudent.setLastName(lName);
					thirdStudent.setFirstName(fName);
					thirdStudent.setMajor(mjr);
					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the new student");
					System.out.println("Student Number: "  + thirdStudent.getStudentNumber());
					System.out.println("Credits: "  + thirdStudent.getCredits());
					System.out.println("Last Name: "  + thirdStudent.getLastName());
					System.out.println("First Name: "  + thirdStudent.getFirstName());
					System.out.println("Major: "  + thirdStudent.getMajor());
					System.out.println("Hours you should be studying a week: "  + thirdStudent.getHours());
				}
			}