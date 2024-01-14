/*   The purpose of this program is to accept user input for the number of credits in a course, 
the name of the course, and then calculate and display the projected hours of study required for the course
through the use of Dialog Boxes.   */

/*Jacob Anderson
CIS 280
8-25-2022
*/

//import java.util.Scanner;		//Needed to utilize the Scanner class
import javax.swing.JOptionPane;

public class StudyDialog
{
	public static void main(String[] args)
	{
	String name, hours;
	int credits, multiplier = 3, studyHours;
	
	//Greet User
	System.out.print("Welcome to College Cost Calculator -- Created By Jacob Anderson ");
	
	//Get course credit count

	hours =
		JOptionPane.showInputDialog("How many credits is the course you are taking?");
		credits = Integer.parseInt(hours);
	
	//Get the course name

	name =
		JOptionPane.showInputDialog("What is the name of the course you are taking?");
	
	
	studyHours = credits * multiplier;
	
	//Display user information
	System.out.println(" ");
	System.out.println("You should expect to spend " + studyHours + " hours each week studying for " + name + ", plan ahead.");
	
	System.exit(0);
	}
}