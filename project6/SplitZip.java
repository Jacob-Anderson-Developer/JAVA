package project6;
/*
Jacob Anderson
CIS 280 
10-19-2022
Project 6

The purpose of this project is to demonstrate aptitude with Strings.  It will take a 9 digit zip code
with a dash (-) after the 5th digit and split it using the dash as a delimiter.

*/
import java.util.*;

public class SplitZip {
	public static void main(String[] args) {

		////////////////////////////// Declarations
		
		String rawZip;
		int i = 1;

		////////////////////////////// Welcome User

		System.out.println("Welcome to the Jacob Anderson Zip Code Splitter!");

		////////////////////////////// Allow User Input

		Scanner keyboard = new Scanner(System.in);

		////////////////////////////// Accepts raw input

		System.out.println("Please enter your zip code in the" + " following format: 49415-1234 ");

		rawZip = keyboard.nextLine();

		////////////////////////////// New String Tokenizer with "-" delimiter

		StringTokenizer tokens = new StringTokenizer(rawZip, "-");

		////////////////////////////// Display Each Token

		while (tokens.hasMoreTokens()) {
			System.out.println("Zip Section " + i + ": " + tokens.nextToken());
			i++;
		}
	}
}