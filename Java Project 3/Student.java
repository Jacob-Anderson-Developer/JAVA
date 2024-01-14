/*  The purpose of this program is to demonstrate the instantiation of an object through a no arg constructor, set and get methods, and passing parameters into the object.   */
/*  This is the class file from which the objects will be created  */

/*Jacob Anderson
CIS 280
8-30-2022
*/


//Class that contains private instance fields

public class Student  //Will be publicly available to code written outside the Student.java file
	{
		//Fields
		
		private String studentNumber;	//private keyword indicates that this variable may not be accessed by statements outside the class
		private int creditsTaken;		//private keyword indicates that this variable may not be accessed by statements outside the class
		private String lastName;		//private keyword indicates that this variable may not be accessed by statements outside the class
		private String firstName;		//private keyword indicates that this variable may not be accessed by statements outside the class
		private String major;			//private keyword indicates that this variable may not be accessed by statements outside the class
		private int studyHours;			//private keyword indicates that this variable may not be accessed by statements outside the class
		private String level;	//private keyword indicates that this variable may not be accessed by statements outside the class
		
		//No arg constructor that initializes values as specified
		
		public Student()  
				{
					
					studentNumber = "0";
					creditsTaken = 0;
					lastName = "NoLast";
					firstName = "NoFirst";
					major = "Unspecified";
					studyHours = 0;
					level = "Undetermined";
				}

			//Constructor that accepts arguments for all of the instance fields
				
 			public Student(String stuNo, int credTak, String lName, String fName, String mjr, String lvl)  //Void not included - does return data?
				{
				  	studentNumber = stuNo;
					creditsTaken = credTak;
					lastName = lName;
					firstName = fName;
					major = mjr;
					level = lvl;
				}
				
				 
				//Set methods for private instance fields
				
 				public void setStudentNumber(String stuNo){studentNumber = stuNo;}
				
				public void setCredits(int credTak){creditsTaken = credTak;}
				
				public void setLastName(String lName){lastName = lName;}
				
				public void setFirstName(String fName){firstName = fName;}
				
				public void setMajor(String mjr){major = mjr;}
				 
				
				//Get methods for private instance fields
				
				public String getStudentNumber(){return studentNumber;}
				
				public int getCredits(){return creditsTaken;}
				
				public String getLastName(){return lastName;}
				
				public String getFirstName(){return firstName;}
				
				public String getMajor(){return major;}
				
				public int getHours(){studyHours = (creditsTaken * 3); return studyHours;}
				
				public String getLevel()	{
													if (creditsTaken <= 5 )
													{
														level = "Part time Student";
													}
													else if (creditsTaken <= 8 )
													{
														level = "Half time Student";
													}
													else if (creditsTaken <= 11 )
													{
														level = "Three Quarter Student";
													}
													else
													{
														level = "Full time Student";
													}
													return level;
											}
	}
	
	
	
