package regularmethodparameter;

public class StudentMarks {

	public static void main(String[] args) {
		
		marks(); //calling method without parameter
		
		marks(75, 82, 89); //calling method with parameter
		
		marks(60, 73, 65);

	}
	
	public static void marks() //static method without parameter
	{
		//variable declaration
		
		int rac;
		int som;
		int tom;
		
		// variable initialization
		
		rac=90;
		som=78;
		tom=85;
		
		// usage
		System.out.println("Static method without parameter");
		System.out.println("=======================");
		System.out.println("Marks in RAC: "+rac);
		System.out.println("Marks in SOM: "+som);
		System.out.println("Marks in TOM: "+tom);
	}
	
	public static void marks(int rac, int som, int tom) //static method with parameter
	{
		System.out.println("=======================");
		System.out.println("Static method with parameter");
		System.out.println("=======================");
		System.out.println("Marks in RAC: "+rac);
		System.out.println("Marks in SOM: "+som);
		System.out.println("Marks in TOM: "+tom);
		
	}
	
	

}
