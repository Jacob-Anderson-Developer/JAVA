/*
Jacob Anderson
CIS 280
9-28-2022

The purpose of this program is to demonstrate the use of overloaded methods by passing multiple amounts of arguments to different compute total methods.

*/


public class TotalFees				//Create a class called TotalFees
{
	public static double total;		//Declare a private double total
	public static double tuitionFee = 999.95;
	public static double bookFee = 209.73;
	public static double techFee = 15.99;
	public static double parkingFee =  20.00;
	
	public TotalFees()
	{
		total = 0;
	}
	
	public static void computeTotal(double tuitionFee)
	{
		total = tuitionFee;
		System.out.println("Tuition only: $" + total);
	}
	
 	public static void computeTotal(double tuitionFee, double bookFee)
	{
		total = tuitionFee + bookFee;
		System.out.println("Tuition and Books: $" + total);
	}

	public static void computeTotal(double tuitionFee, double bookFee, double techFee)
	{
		total = tuitionFee + bookFee + techFee;
		System.out.println("Tuition, Books, and Technology: $" + total);
	}

	public static void computeTotal(double tuitionFee, double bookFee, double techFee, double parkingFee)
	{
		total = tuitionFee + bookFee + techFee + parkingFee;
		System.out.println("The whole package: $" + total);
	} 
	

	public static void main(String[] args)
	{
		
	System.out.println("Welcome to the Jacob Anderson College Fee Calculator!");
	
	computeTotal(tuitionFee);
	computeTotal(tuitionFee, bookFee);
	computeTotal(tuitionFee, bookFee, techFee);
	computeTotal(tuitionFee, bookFee, techFee, parkingFee);
	}
}