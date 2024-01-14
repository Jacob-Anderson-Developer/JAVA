package proj9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Jacob Anderson
 * 12-2-2022
 * CIS 280
 * 
 * createDB.java
 * 
 * The purpose of this program is to create the College database and to create the MAJOR table then the STUDENT table so the STUDENT table can reference the 
 * MAJOR tables 3 digit Major Code.  The program will populate the tables with data after attempting a drop.
 */

public class createDB {
	public static void main(String[] args) throws Exception {
		final String DB_URL = "jdbc:derby:CollegeDB;create=true";


		// Create a connection to the database.
		Connection conn = DriverManager.getConnection(DB_URL);

		// Create a Statement object.
		Statement stmt = conn.createStatement();
		
		// Greet User
        System.out.println("Welcome to the Jacob Anderson College Database Creator Application!\n");
        System.out.println("Checking to see if database exists...\n");

		try {
			stmt.execute("DROP TABLE STUDENT");
		} catch (Exception e) {
			System.out.println("Table drop failed, creating Student Table.\n");
		}

		try {
			stmt.execute("DROP TABLE MAJOR");
		} catch (Exception e) {
			System.out.println("Table drop failed, creating Major Table.\n");
		}

		// Create Major table.

		stmt.execute("CREATE TABLE MAJOR"
				+ "(CODE CHAR(3) NOT NULL, MAJORNAME CHAR(50) NOT NULL, DESCRIPTION CHAR(70) NOT NULL, PRIMARY KEY(CODE))");

		stmt.execute("INSERT INTO MAJOR (CODE, MAJORNAME, DESCRIPTION)"
				+ "VALUES ('CIS', 'Computer Information Systems', 'A study of Computer Science.'),"
				+ "('ANT', 'Anthropology', 'A study of Humanity.')," + "('BIO', 'Biology', 'A study of Life.'),"
				+ "('MAT', 'Math', 'A study of numbers and formulas.'),"
				+ "('CHM', 'Chemistry', 'A study of the properties and behavior of matter.'),"
				+ "('PHY', 'Physics', 'A study of matter and its motion / behavior through space and time.')");

		System.out.println("Major Table Created\n");

		System.out.println("Compiling Major Records...\n");

		// Create Student table.

		stmt.execute("CREATE TABLE STUDENT"
				+ "(STUNO CHAR(10) NOT NULL, "
				+ "CODE CHAR(3) NOT NULL, FIRSTNAME CHAR(20) NOT NULL, LASTNAME CHAR(25) NOT NULL, CREDITLOAD INT, PRIMARY KEY(STUNO),"
				+ "FOREIGN KEY (CODE)REFERENCES MAJOR)");

		System.out.println("Student Table Created\n");

		System.out.println("Compiling Student Records...");

		// Populate table with data
		stmt.execute("INSERT INTO STUDENT (STUNO, FIRSTNAME, LASTNAME, CREDITLOAD, CODE)"
				+ "VALUES  ('BR12345678','Brad', 'Radical', 1, 'CIS')," + "('TL12345678','Thomas', 'Light', 16, 'PHY'),"
				+ "('SC12345678','Sarah', 'Connor', 8, 'BIO')," + "('KY12345678', 'Kinuyo', 'Yamashita', 17, 'CHM'),"
				+ "('LT12345678', 'Larry', 'Thomas', 10, 'ANT')," + "('PA12345678', 'Pixie', 'Anderson', 11, 'CIS')");


		System.out.println("\nDatabase and Record Compilation Complete.");
		stmt.close();
		conn.close();
	}
}
