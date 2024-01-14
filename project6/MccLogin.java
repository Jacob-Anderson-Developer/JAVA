package project6;
import javax.swing.*;
import java.util.*;
/*
Jacob Anderson
CIS 280 
10-19-2022
Project 6

The purpose of this project is to demonstrate aptitude with the StringBuilder class and the methods it has to offer.
This will take user input and generate a user name and password.
*/

public class MccLogin {
	public static void main(String[] args) {

		////////////////////////////// Declarations

		String fName, lName, stuNo, rawFirst, rawLast, rawNo;
		
		////////////////////////////// Welcome User
		
		JOptionPane.showMessageDialog(null, "Welcome to the Jacob Anderson User Name and Password Generator!");

		////////////////////////////// Accepts raw input

		rawFirst = JOptionPane.showInputDialog("Enter your first name");
		rawLast = JOptionPane.showInputDialog("Enter your last name");
		rawNo = JOptionPane.showInputDialog("Enter your student number");

		////////////////////////////// Trims raw input of blanks

		fName = rawFirst.trim();
		lName = rawLast.trim();
		stuNo = rawNo.trim();

		////////////////////////////// Create new StringBuilder objects

		StringBuilder userName = new StringBuilder();
		StringBuilder password = new StringBuilder();
		StringBuilder message = new StringBuilder();

		////////////////////////////// Create User Name

		userName.append(fName.toLowerCase());
		userName.append(".");
		userName.append(lName.toLowerCase());

		////////////////////////////// Create Password

		password.append(fName.substring(0, 1).toLowerCase());
		password.append(lName.substring(0, 1).toLowerCase());
		password.append(stuNo);
		password.append("!");

		////////////////////////////// Create Message
		
		message.insert(0, "Your Password is: ");
		message.append(password);
		message.append("\nYour user name is: ");
		message.append(userName);
		
		////////////////////////////// Display Message

		JOptionPane.showMessageDialog(null, message);
		
		System.exit(0);
	}
}