package chap10;

/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * ReadMyBinary.java
 * 
 * This program is designed to read the binary information that is written by the WriteMyBinary file
 * and to display it in an attractive manner.
 */

import java.io.*;

public class ReadMyBinary
{
	public static void main(String[] args) throws IOException
	{
		///////////////// Declare Variables
		
		boolean endOfFile = false;
		int age;
		String name;
		
		///////////////// Creates a file named NameAge.dat that can be opened for binary output.
		
		FileInputStream fstream = new FileInputStream("NameAge.dat");
		DataInputStream inputFile = new DataInputStream(fstream);
		
		///////////////// Welcome User
		
		System.out.println("Welcome to the Jacob Anderson Binary Reader Program!");
		
		///////////////// Inform user data reading is taking place
		
		System.out.println("\nReading data from the file...");
		
		///////////////// Read data from the file until the end of the file is reached.  Display the names and ages.
		
		while (!endOfFile) 
		{
			try
			{
				name = inputFile.readUTF();
				age = inputFile.readInt();
				System.out.println("\nYour name is " + name + " and your age is " + age + ".");
			}
			catch(EOFException e) 
			{
				endOfFile = true;
			}
		}
		inputFile.close();
	}
}