/*Jacob Anderson
CIS 280
9-11-2022

The purpose of this project is to create 3 objects with get and set methods and display the information afterwards */

import java.util.Scanner;		
			
			public class DemoCat
			{
				//Begin Main
				public static void main(String[] args)
				{

					int demoAge;
					String demoName, demoGender, demoColor;
					
					System.out.println(" ");
					System.out.println("Welcome to the Jacob Anderson Cat Ownership Information Program!");
					
	
					//Instantiate a cat object
					YourChoice cat1 = new YourChoice();  //Create Cat object
					 					
					//Create Scanner object for keyboard input
					Scanner keyboard = new Scanner(System.in);
					
					//Accept User input to define fields		
					
					System.out.println(" ");
					System.out.print("What is the cats name?");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender?");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color?");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age?");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					
 					//Call Set Methods
					cat1.setName(demoName);
					cat1.setGender(demoGender);
					cat1.setColor(demoColor);
					cat1.setAge(demoAge); 
					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the cat");
					System.out.println("Name: "  + cat1.getName());
					System.out.println("Gender: "  + cat1.getGender());
					System.out.println("Color: "  + cat1.getColor());
					System.out.println("Age: "  + cat1.getAge());
					
					//Instantiate a cat object
					YourChoice cat2 = new YourChoice();  //Create Cat object
					
					//Accept User input to define fields		
					
					System.out.println(" ");
					System.out.print("What is the cats name?");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender?");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color?");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age?");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					
 					//Call Set Methods
					cat2.setName(demoName);
					cat2.setGender(demoGender);
					cat2.setColor(demoColor);
					cat2.setAge(demoAge); 
					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the cat");
					System.out.println("Name: "  + cat2.getName());
					System.out.println("Gender: "  + cat2.getGender());
					System.out.println("Color: "  + cat2.getColor());
					System.out.println("Age: "  + cat2.getAge());
					
					YourChoice cat3 = new YourChoice();  //Create Cat object
					
					//Accept User input to define fields		
					System.out.println(" ");
					System.out.print("What is the cats name?");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender?");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color?");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age?");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					 
					
 					//Call Set Methods
					cat3.setName(demoName);
					cat3.setGender(demoGender);
					cat3.setColor(demoColor);
					cat3.setAge(demoAge); 
					
					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the cat");
					System.out.println("Name: "  + cat3.getName());
					System.out.println("Gender: "  + cat3.getGender());
					System.out.println("Color: "  + cat3.getColor());
					System.out.println("Age: "  + cat3.getAge());
					
					//Instantiate a cat object
					YourChoice cat4 = new YourChoice("PeaPod", "Female", "Black", 5);  //Create Cat object

					
					//Accept User input to define fields		
					
					System.out.println(" ");
					System.out.print("What is the cats name?");
					demoName = keyboard.nextLine();
					
					System.out.print("What is the cats gender?");
					demoGender = keyboard.nextLine();
					
					System.out.print("What is the cats color?");
					demoColor = keyboard.nextLine();	
					
					System.out.print("What is the cats age?");
					demoAge = keyboard.nextInt();
					
					//Consumes the return from the integer input
					keyboard.nextLine();
					
					//Call Set Methods
					cat4.setName(demoName);
					cat4.setGender(demoGender);
					cat4.setColor(demoColor);
					cat4.setAge(demoAge); 
					
					
					//Display results
					System.out.println(" ");
					System.out.println("Here is the data on the cat");
					System.out.println("Name: "  + cat4.getName());
					System.out.println("Gender: "  + cat4.getGender());
					System.out.println("Color: "  + cat4.getColor());
					System.out.println("Age: "  + cat4.getAge());

				}
			}