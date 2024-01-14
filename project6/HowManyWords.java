package project6;
import java.util.StringTokenizer;
import java.util.*;
/*
Jacob Anderson
CIS 280 
10-19-2022
Project 6

The purpose of this project is to demonstrate an aptitude in using the string tokenizer.  
It will take a string and determine how many tokens are present using whitespace as a delimiter.
*/

public class HowManyWords {
	public static void main(String[] args) {
		
		//////////////////////////////// Variable Declaration

		String input;
		int total = 0;

		//////////////////////////////// Welcome User

		System.out.println("Welcome to the Jacob Anderson String Tokenizer!.");

		//////////////////////////////// Create Scanner for user input

		Scanner keyboard = new Scanner(System.in);

		//////////////////////////////// Take user input

		System.out.println("Enter a sentence, and I will tokenize it for you.");
		input = keyboard.nextLine();

		//////////////////////////////// Tokenize the string

		StringTokenizer tokenized = new StringTokenizer(input);

		//////////////////////////////// Output the results

		while (tokenized.hasMoreTokens()) {
			System.out.println(tokenized.nextToken());
			total++;
		}
		System.out.println("The sentence had the following number of tokens: " + total);
		System.exit(0);
	}
}