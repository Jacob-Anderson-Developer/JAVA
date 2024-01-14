package proj9;
/*Jacob Anderson
CIS 280
11-23-2022
CustomStudyDialog.java
/*
 * The program has been updated to use overloaded methods to change the attributes of the dialog boxes.
 */
/*   The purpose of this program is to accept user input for the number of credits in a course, 
the name of the course, and then calculate and display the projected hours of study required for the course
through the use of Dialog Boxes.   */

/*Jacob Anderson
CIS 280
11-06-2022


*/


import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;

public class CustomStudyDialog {
	public static void main(String[] args) {
		String name, hours;
		int credits = 0, multiplier = 3, studyHours;
		boolean hourError = true;

		Date date = new Date();
		Timestamp ts = new Timestamp(date.getTime());

		// Greet User
		JOptionPane.showMessageDialog(null,
				"Welcome to College Cost Calculator -- Created By Jacob Anderson. \n" + "Date: " + ts,
				"College Cost Calculator", JOptionPane.PLAIN_MESSAGE);

		// Get course credit count
		do {
			try {
				hours = JOptionPane.showInputDialog(null, "How many credits is the course you are taking?",
						"Hour Input", JOptionPane.PLAIN_MESSAGE);
				credits = Integer.parseInt(hours);
				hourError = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Please enter numbers only.");
			}
		} while (hourError || credits < 1);
		// Get the course name

		name = JOptionPane.showInputDialog(null, "What is the name of the course you are taking?", "Course Name Input",
				JOptionPane.PLAIN_MESSAGE);

		studyHours = credits * multiplier;

		// Display user information
		
		if (studyHours >= 15) 
		{		
		JOptionPane.showMessageDialog(null,
				"You should expect to spend " + studyHours + " hours each week studying for " + name + ", plan ahead.",
				"Study Total", JOptionPane.WARNING_MESSAGE);
		}
		else 
		{
			JOptionPane.showMessageDialog(null,
					"You should expect to spend " + studyHours + " hours each week studying for " + name + ", plan ahead.",
					"Study Total", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0);
	}
}