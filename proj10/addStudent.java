package proj10;

import java.util.Scanner;
import java.sql.*;

/*
 * Jacob Anderson
 * 12-2-2022
 * CIS 280
 * 
 * addStudent.java
 * 
 * 
 * The purpose of this program is to guide the user through the process of adding data using an application and SQL.
 * It creates a student number automatically for the user.
 */

public class addStudent {
	public static void main(String[] args) {
		
		// Declare Variables
		String fName, lName, mjrCode ="N/A", mjrRaw = "N/A", credLoad;
		int credInt = 0, mjrNumerized = 0;
		boolean credError = true, mjrError = true;

		// Create a named constant for the URL.
		// NOTE: This value is specific for Java DB.
		final String DB_URL = "jdbc:derby:CollegeDB";

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		try {
			// Create a connection to the database.
			Connection conn = DriverManager.getConnection(DB_URL);

			// Create a Statement object.
			Statement stmt = conn.createStatement();
			
			// Greet User
	         System.out.println("Welcome to the Jacob Anderson Student Profile Creation Application!\n");

			// Get the data for the new student.
			System.out.print("Enter your first name: ");
			fName = keyboard.nextLine();
			System.out.print("Enter your last name: ");
			lName = keyboard.nextLine();
			
			String fInitial = fName.substring(0, 1);
			String lInitial = lName.substring(0, 1);
			
			StringBuilder numCreator = new StringBuilder();
			
			numCreator.append(fInitial);
			numCreator.append(lInitial);
			numCreator.append("12345678");
			
			String generated = numCreator.toString();
			
			String sqlStatement = "SELECT * FROM MAJOR";
			ResultSet result = stmt.executeQuery(sqlStatement);

			System.out.println("Available Majors:\n");

			System.out.println("COURSE CODE      NAME \t\t\t\t\t\t   Description\n");

			while (result.next()) {
				System.out.println(result.getString("CODE") + "              " + result.getString("MAJORNAME") + result.getString("DESCRIPTION"));
			}
			
			
			// Apply major selection for user
			
			do {
				try {

					System.out.print("\nEnter 1 for CIS, 2 for ANT, 3 for PHY, 4 for BIO, or 5 for CHM ");
					mjrRaw = keyboard.nextLine();
					mjrNumerized = Integer.parseInt(mjrRaw);

					if (mjrNumerized == 1) {
						mjrCode = "CIS";
					} else if (mjrNumerized == 2) {
						mjrCode = "ANT";
					} else if (mjrNumerized == 3) {
						mjrCode = "PHY";
					} else if (mjrNumerized == 4) {
						mjrCode = "BIO";
					} else {
						mjrCode = "CHM";
					}
					System.out.println();

					mjrError = false;
				} catch (Exception e) {
					System.out.println("Please select a 3 digit code from the list.");
				}
			} while (mjrError || mjrNumerized > 5 || mjrNumerized < 1);
			do {
				try {
					System.out.print("Enter your credit load:");
					credLoad = keyboard.nextLine();
					credInt = Integer.parseInt(credLoad);
					credError = false;
				} catch (Exception e) {
					System.out.println("Please enter a positive number.");
				}
			} while (credError || credInt < 1);
			
			// Create a string with an INSERT statement that uses the data input from the
			// keyboard
			sqlStatement = "INSERT INTO Student (STUNO, FIRSTNAME, LASTNAME, CODE, CREDITLOAD) VALUES ('" + generated + "', '" + fName + "', '"
					+ lName + "', '" + mjrCode + "',  " + credInt + ")";

			System.out.println(sqlStatement);

			// Send the statement to the DBMS.
			int rows = stmt.executeUpdate(sqlStatement);

			// Display the results.
			System.out.println(rows + " row(s) added to the table.");

			sqlStatement = "SELECT * FROM STUDENT";
			result = stmt.executeQuery(sqlStatement);

			System.out.println("Enrolled Students:\n");

			System.out.println("First Name          Last Name\n");

			while (result.next()) {
				System.out.println(result.getString("FIRSTNAME") + result.getString("LASTNAME"));
			}

			// Close the connection.
			conn.close();

			keyboard.close();
		} catch (Exception ex) {
			System.out.println("ERROR: " + ex.getMessage());
		}
	}
}
