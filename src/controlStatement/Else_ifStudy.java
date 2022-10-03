package controlStatement;

public class Else_ifStudy {

	public static void main(String[] args) 
	{
		char grade='B';
		
		if(grade=='A')
		{
			System.out.println("Marks are >90");
			
		}
		
		else if (grade=='B')
		{
			System.out.println("Marks are in range of >=66 to <90");
		}
		
		else if (grade=='C') 
		{
			System.out.println("Marks are in range of >=50 to <66");
			
		}
		
		else if (grade=='D') 
		{
			System.out.println("Marks are in range of >=40 to <50");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
	}

}
