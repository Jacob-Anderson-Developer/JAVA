package chap10;

/*
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * WriteMyBinary.java
 * 
 * The purpose of this program is to write a name and age into a binary file with the intent to read it
 * using ReadMyBinary.  It will continue until the user chooses to quit entering names and ages.
 */

import java.io.*;
import java.util.*;

public class WriteMyBinary {
	public static void main(String[] args) throws IOException {
		
		///////////////// Declare Variables
		
		String name = null;
		int age = 0, choice;
		boolean ageError = true;

		///////////////// Create Input

		Scanner key = new Scanner(System.in);
		
		System.out.println("Welcome to the Jacob Anderson Binary Name and Age Recorder!");

		///////////////// Open Binary File for Output

		FileOutputStream fstream = new FileOutputStream("NameAge.dat", true);

		DataOutputStream outputFile = new DataOutputStream(fstream);

		///////////////// Information Gathering and Validation

		do {
			do {
				try {
					System.out.println("What is your age? ");
					age = key.nextInt();
					// Consumes integer input
					key.nextLine();
					ageError = false;
				} catch (InputMismatchException e) {
					System.out.println("Please enter a number only.");
					// Consumes integer input
					key.nextLine();
				}
			} while (ageError);

			System.out.println("What is your name? ");
			name = key.nextLine();

			// Inform user process has begun

			System.out.println("Writing to file...");

			// Write to binary file

			outputFile.writeUTF(name);
			outputFile.writeInt(age);

			// Ask user if they would like to continue

			System.out.println("Enter a 1 to continue, or anything else to quit.");
			choice = key.nextInt();

		} while (choice == 1);

		// Close file

		outputFile.close();

		// Close input

		key.close();
	}
}