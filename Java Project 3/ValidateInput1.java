/*
CIS 280
Jacob Anderson
9-15-2022

The purpose of this program is to demonstrate knowledge of loops and validation.  A user is to enter a number between 101 and 199.  If the user fails to do so, they will be prompted to enter the correct information again.

*/

import javax.swing.*;
public class ValidateInput1
{
  public static void main (String args[])
  {
    // variables
	int number;
	String entry, message = "No message passed yet";
	
	//Welcome User
	JOptionPane.showMessageDialog(null, "Welcome to the Jacob Anderson Number Validator Program!");

	//Get input from user
	entry = JOptionPane.showInputDialog(null, "Enter a number between 101 and 199");
    number = Integer.parseInt(entry);
	
	//While the data is invalid, continue to run the following loop
	while (number <101 || number > 199)
	{
		JOptionPane.showMessageDialog(null, "\n Please enter a valid number.  Number must be between 101 and 199."); 
		entry = JOptionPane.showInputDialog(null, "Enter a number between 101 and 199");
		number = Integer.parseInt(entry);
	}

	//If data is valid
	if ((number >= 101 && number <=199))
	{
		message = "Congratulations!  Your entry of " + number + " was accepted!";
	}

    JOptionPane.showMessageDialog(null, message);
	
	System.exit(0);
  }
}
    



