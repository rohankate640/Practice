package regularmethodparameter;

public class StudentInfo {

	public static void main(String[] args) {
	 
		StudentInfo si=new StudentInfo(); //creating object
		si.info(); //calling non static regular method without parameter
		StudentMarks.marks(70,74, 88); //calling method from other class
		
		si.info("Rohan", 27, 'M', 72.6f, 28); //calling non static regular method with parameter
		
		si.info("Pankaj", 29, 'M', 75f, 10);
		
		

	}
	
	public void info() //without pararmeter
	{
		//variable declaration
		
		String name;
		int age;
		char gender;
		float weight;
		int roll;
		
		//variable initialization
		
		name="Rohan Kate";
		age=27;
		gender='M';
		weight=72.6f;
		roll=28;
		
		//usage
		
		System.out.println("Without parameter");
		
		System.out.println("****************************");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+weight+" kg");
		System.out.println("My roll no. is "+roll);
		System.out.println("****************************");
	}
	
	public void info(String name, int age, char gender, float weight, int roll) //with parameter
	{
		System.out.println("With parameter");
		
		System.out.println("****************************");
		System.out.println("My name is "+name);
		System.out.println("My age is "+age);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+weight+" kg");
		System.out.println("My roll no. is "+roll);
		System.out.println("****************************");
	}

}
