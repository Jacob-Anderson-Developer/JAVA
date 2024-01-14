package proj10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Jacob Anderson
 * CIS 280
 * 12-2-2022
 * 
 * displayStudent.java
 * 
 * The purpose of this program is to display the information about the student that has been compiled from the other programs.  It will use SQL to 
 * retrieve the information and a while statement to display the result set.
 */
 
public class displayStudent
{
   public static void main(String[] args)
                      throws Exception
   {
      final String DB_URL =
            "jdbc:derby:CollegeDB;create=true";
            
      try
      {    
         // Create a connection to the database.
         Connection conn = 
                    DriverManager.getConnection(DB_URL);
            
         // Create a Statement object.
         Statement stmt = conn.createStatement();
         
         // Greet User
         System.out.println("Welcome to the Jacob Anderson Student Display Application!\n");
         
         // Create result set from SQL statement
         String sqlStatement = "SELECT * FROM STUDENT";
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         System.out.println("Enrolled Students:\n");
         
         System.out.println("First Name          Last Name                Major      Enrolled Credits        Student Number\n");
         
         while (result.next())
         {
        	 System.out.println(result.getString("FIRSTNAME") + result.getString("LASTNAME") + result.getString("CODE")+ "\t" + result.getString("CREDITLOAD") + "\t\t\t" + result.getString("STUNO"));
         }
         
         // Close the resources.
         stmt.close();     
         conn.close();
         System.out.println("\nDone");
      }
      catch(Exception ex)
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   } 
}
