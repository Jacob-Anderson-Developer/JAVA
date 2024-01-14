package chap10;
/*Updated 11-3-2022
 * 
 * Try and catch statements have been added to ensure valid data is being entered.
 * 
 * Jacob Anderson
 * CIS 280
 * 11-3-2022
 * 
 * StudyDialog.java
 * 
 *   The purpose of this program is to accept user input for the number of credits in a course, 
 * the name of the course, and then calculate and display the projected hours of study required for the course
 * through the use of Dialog Boxes.   
 */

import javax.swing.JOptionPane;

public class StudyDialog {
	public static void main(String[] args) {

		// Declare variables

		String name, hours, greeting, message, posNo;
		int credits = 0, multiplier = 3, studyHours;
		boolean creditError = true;

		// Greet User

		greeting = "Welcome to College Cost Calculator -- Created By Jacob Anderson";
		JOptionPane.showMessageDialog(null, greeting);

		// Get course credit count

		do {
			try {
				hours = JOptionPane.showInputDialog("How many credits is the course you are taking?");
				credits = Integer.parseInt(hours);
				creditError = false;
			} catch (NumberFormatException e) {
				posNo = "Please enter positive numbers only";
				JOptionPane.showMessageDialog(null, posNo);
			}
		} while (creditError || credits < 1);

		// Get the course name

		name = JOptionPane.showInputDialog("What is the name of the course you are taking?");

		studyHours = credits * multiplier;

		// Display user information

		System.out.println(" ");
		message = "You should expect to spend " + studyHours + " hours each week studying for " + name
				+ ", plan ahead.";
		JOptionPane.showMessageDialog(null, message);
		System.exit(0);
	}
}