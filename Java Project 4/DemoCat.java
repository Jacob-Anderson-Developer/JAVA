/*Jacob Anderson
CIS 280
9-28-2022

The purpose of this project is to demonstrate aptitude in using static variables, overloaded constructors,
and the toString method. It receives keyboard input and ouputs the attributes of an object created from keyboard input and the static catSound String. */

import java.util.Scanner;		
			
			public class DemoCat
			{
				//Begin Main
				public static void main(String[] args)
				{

					int demoAge;
					String demoName, demoGender, demoColor, demoSound;
					
					System.out.println(" ");
					System.out.println("Welcome to the Jacob Anderson Cat Ownership Information Program!");
					
	
					//Instantiate a cat object
					Cat cat1 = new Cat();  //Create Cat object
					 					
					//Create Scanner object for keyboard input
					Scanner keyboard = new Scanner(System.in);
					
					//Accept User input to define fields		
					
					System.out.println(" ");
					System.out.print("What is the cats name? ");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender? ");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color? ");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age? ");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					
 					//Call Set Methods
					cat1.setName(demoName);
					cat1.setGender(demoGender);
					cat1.setColor(demoColor);
					cat1.setAge(demoAge); 
					
					System.out.println(cat1.toString());
					
					//Instantiate a cat object
					Cat cat2 = new Cat();  //Create Cat object
					
					//Accept User input to define fields		
					
					System.out.println(" ");
					System.out.print("What is the cats name? ");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender? ");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color? ");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age? ");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					
 					//Call Set Methods
					cat2.setName(demoName);
					cat2.setGender(demoGender);
					cat2.setColor(demoColor);
					cat2.setAge(demoAge); 
					
					System.out.println(cat2.toString());
					
					Cat cat3 = new Cat();  //Create Cat object
					
					//Accept User input to define fields		
					System.out.println(" ");
					System.out.print("What is the cats name? ");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender? ");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color? ");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age? ");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					 
					
 					//Call Set Methods
					cat3.setName(demoName);
					cat3.setGender(demoGender);
					cat3.setColor(demoColor);
					cat3.setAge(demoAge); 
					
					System.out.println(cat3.toString());
					
					//Instantiate a cat object
					Cat cat4 = new Cat("PeaPod", "Female", "Black", 5);  //Create Cat object

					System.out.println(cat4.toString());
					
				}
			}
			
			

			