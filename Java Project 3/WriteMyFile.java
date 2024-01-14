/*
Jacob Anderson
9-21-2022
CIS 280

The purpose of this program is to demonstrate the ability to create and write to a txt file using Java.

*/


import java.util.Scanner; 	//Needed for Scanner
import java.io.*;			//Needed for PrintWriter and IOException

public class WriteMyFile
{
	public static void main(String[] args) throws IOException
	{
		String textIn;	 //User text input to be written to a file
		
		
		System.out.print("Welcome to the Jacob Anderson Desert Island List Creator! \n");
		
		// Create a Scanner Object for keyboard input.
		Scanner keyboard = new Scanner(System.in);
		
		//Creates a PrintWriter object and passes the file name "DesertList.txt" to the constructor.  
		//This will create an empty file named DesertList.txt and establish a connection between it and the PrintWriter object referenced by outputFile.
		
		PrintWriter outputFile = new PrintWriter("DesertList.txt"); 
		
		//Begin Loop
		do
		{
			//Get list of items to be brought to the island
			System.out.print("Enter the item you would like to bring on the desert island. \n");
			System.out.print("(Enter 'X' to finish the input portion of the program) \n");
			textIn = keyboard.nextLine();
		
		//Get the File Name (Not Needed)
		if (!textIn.equalsIgnoreCase("x"))
		{
			//Write the item to the file
			outputFile.println(textIn);
		}
		
		} while (!textIn.equalsIgnoreCase("x"));
		outputFile.close();
	}
}