package Michigan;
import java.util.Scanner;

/**
 * Jacob Anderson
 * CIS 280
 * 9-29-2022
 * 
 * The purpose of this program is to allow user input for the temperature over the last 7 days.  It will then put
 * those temperatures into an array.  From there it will display how many frigid, cold, warm, and hot days there
 * were in the past 7 days. It will also display the hottest and lowest temperatures for the 
 * last 7 days as well as a temperature average.
 */

public class Michigan
{
   public static void main(String[] args)
   {
	      final int ARRAY_SIZE = 7;
	      int totalTemp = 0, frigid = 0, cold = 0, warm = 0, hot = 0, tempAverage = 0;
	      
	      
	      int[] temperature = new int[ARRAY_SIZE];
	      
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	      
	      // Welcome User
	      System.out.println("Welcome to the Jacob Anderson Temperature Analyzer Program!");
	      
	      for (int day = 0; day < ARRAY_SIZE; day++) 
	      {
	    	  System.out.println("Please input the temperature for day " + (day+1));
	      	  temperature[day] = keyboard.nextInt();
	      	  
				if (temperature[day] <= 30) 
				{
					frigid++;
				}

				else if (temperature[day] <= 50) 
				{
					cold++;
				}

				else if (temperature[day] <= 70) {
					warm++;
				}

				else if (temperature[day] >= 71) {
					hot++;
				}

				else {
					System.out.println("Please enter an integer temperature value");
				}
	      	  
	      	  
	      }
	      
	      for (int day = 0; day < ARRAY_SIZE; day++) 
	      {
	    	  totalTemp += temperature[day];
	      }
	      
	      int highest = temperature[0];
	      
	      for (int i = 1; i < temperature.length; i++)
	      {
	    	  if (temperature[i] > highest)
	    		  highest = temperature[i];
	      }
	      
	      int lowest = temperature[0];
	      
	      for (int i = 1; i < temperature.length; i++)
	      {
	    	  if (temperature[i] < lowest)
	    		  lowest = temperature[i];
	      }
	      
	      
	      
	      tempAverage = (totalTemp/ARRAY_SIZE);
	      System.out.println("Total Temp: " + totalTemp + " degrees.");
	      System.out.println("Average temperature for the week: " + tempAverage + " degree(s).");
	      System.out.println("Number of frigid days: " + frigid);
	      System.out.println("Number of cold days: " + cold);
	      System.out.println("Number of warm days: " + warm);
	      System.out.println("Number of hot days: " + hot);
	      System.out.println("Highest Temperature: " + highest + " degree(s).");
	      System.out.println("Lowest Temperature: " + lowest + " degree(s).");
	      
	      keyboard.close();
   }
}