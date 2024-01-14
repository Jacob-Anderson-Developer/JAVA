package Languages;
import java.util.ArrayList; // Needed for ArrayList class
/*Jacob Anderson
 *CIS 280
 *9-29-2022
 *
 *The purpose of this exercise it to modify the existing program so the array displays the correct information.
 * 
 */





/**
 *  This program demonstrates an ArrayList.
 */
 
// Compile and run this program in its current state to study its behavior
// then, make the modifications explained below in the "Add Code" comments
 

public class Languages
{
   public static void main(String[] args)
   {
      // Create an ArrayList to hold some names.
      ArrayList<String> nameList = new ArrayList<String>();
      
      // Leave this section as is.... 
      nameList.add("C");
	  nameList.add("Nonsense");
      nameList.add("C++");
	  nameList.add("Ridiculous");
	  
	  // Add code to this program that uses the appropriate methods to:
		// 1.  Replace "Ridiculous" with "RPG"
	  nameList.set(3, "RPG");
		// 2.  Remove "Nonsense" from the list
	  nameList.remove(1);
		// 3.  Add "Java" to the end of the list
	  nameList.add("Java");
		// 4.  Insert "C#" into the list, right after "C++"
	  nameList.add(3,"C#");

		
		
		
		
      
      // Display the size of the ArrayList.
      System.out.println("The ArrayList has " +
                         nameList.size() +
                         " objects stored in it.");

      // Now display the items in nameList.
      for (int index = 0; index < nameList.size(); index++)
         System.out.println(nameList.get(index));
   }
}