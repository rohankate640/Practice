package methods;

public class MathOperations {

	public static void main(String[] args) {
	
		MathOperations a=new MathOperations(); //created object for class
		a.add(); //calling non static method with the help of object
		
		sub(); //calling static method

	}
	
	public void add() //non static regular method
	{
		int a;
		int b;
		int addition;
		a=28;
		b=8;
		addition=a+b;
		System.out.println("Addition is "+addition);
		
	}
	
	public static void sub() //static regular method
	{
		int a;
		int b;
		int substraction;
		a=28;
		b=8;
		substraction=a-b;
		System.out.println("Substraction is "+substraction);
				
	}
	
	

}
