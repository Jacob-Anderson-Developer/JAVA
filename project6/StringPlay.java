package project6;
/*
Jacob Anderson
CIS 280 
10-19-2022
Project 6

The purpose of this project is to demonstrate an aptitude in using methods available to string objects.
It will take the string "play" and use various methods to manipulate the initial string through copying it
to new strings.
*/
public class StringPlay {
	public static void main(String[] args) {

		////////////////////////////////// Variable Declaration

		String play = "James Gosling is also called the Father of Java";
		String play2, play3;
		boolean play4;
		int position;

		////////////////////////////////// Welcome User

		System.out.println("Welcome to the Jacob Anderson String Manipulator Program!\n");

		////////////////////////////////// Execute methods

		position = play.indexOf('G');
		play2 = play.replace('a', 'A');
		play3 = play.substring(22, 39);
		play4 = play.startsWith("James");

		////////////////////////////////// Display Results
		
		System.out.println("This is the string with the capitalized A's: " + play2);
		System.out.println("\nThis is a demonstration of the substring to display 'called the Father': " + play3);
		System.out.println("\nThe test to see if the string began with 'James' came back " + play4 + ".");
		System.out.println("\nThe index of G is " + position);

		while (position != -1) {
			System.out.println("\nThe letter 'g' can be found in position " + position);
			position = play.indexOf('g', position + 1);
		}

	}
}