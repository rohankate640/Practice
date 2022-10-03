package methods;

public class NonStaticMethodCall {

	public static void main(String[] args) {
		
		//classname objectname= new classname();
		
		NonStaticMethodCall n=new NonStaticMethodCall();//created object of a class
		
		//to call nonstatic method from class
		// objectname.methodname();
		
		n.test();
		
		MyClass m=new MyClass();
		
		m.myMethod();

	}
	
	public void test()  //non static regular method
	{
		System.out.println("this is test method");
		
	}

}
