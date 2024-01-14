/*Jacob Anderson
CIS 280
9-28-2022

The purpose of this project is to demonstrate aptitude in using static variables, overloaded constructors,
and the toString method. */




public class Cat  //Will be publicly available to code written outside the Student.java file
	{
		//Fields
		
		private String name;		//private keyword indicates that this variable may not be accessed by statements outside the class
		private String gender;		//private keyword indicates that this variable may not be accessed by statements outside the class
		private String color;		//private keyword indicates that this variable may not be accessed by statements outside the class
		private int age;			//private keyword indicates that this variable may not be accessed by statements outside the class
		private static String catSound = "Meow";
		
		//No arg constructor that initializes values as specified
		
		public Cat()  
				{
					name = "Placeholder";
					gender = "Placeholder";
					color = "Placeholder";
					age = 0;
				}

			//Constructor that accepts arguments for all of the instance fields
				
 			public Cat(String demoName, String demoGender, String demoColor, int demoAge)  //Void not included - does return data?
				{
					name = demoName;
					gender = demoGender;
					color = demoColor;
					age = demoAge;
				}
				
				 
				//Set methods for private instance fields
				
 				public void setName(String demoName){name = demoName;}
				
				public void setGender(String demoGender){gender = demoGender;}
				
				public void setColor(String demoColor){color = demoColor;}
				 
				public void setAge(int demoAge){age = demoAge;}
				
				
				
				//Get methods for private instance fields
				
				public String getName(){return name;}	
				
				public String getGender(){return gender;}
				
				public String getColor(){return color;}
				
				public int getAge(){return age;}
				
				public static String getSound(){return catSound;}
				
				
			public String toString()
				{
				String str ="\nName: " + name +
							"\nGender: " + gender +
						   	"\nColor: " + color +
							"\nAge: " + age +
							"\nSound the animal makes: " + catSound + "\n";
							
							return str;
				}
				
	}
	
	