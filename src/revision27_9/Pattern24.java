package revision27_9;

public class Pattern24 {

	public static void main(String[] args) {
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
		
		int rows = 5;
		System.out.println("## Printing the pattern ##");
		for (int i = 1; i <= rows; i++)
		{
			for (int j = 1; j <= i; j++) 
                       { 
                               System.out.print(j + " "); 
                       } 
                       System.out.println(); 
                }
                for (int i = rows; i >= 1; i--)
		{
			for (int j = 1; j < i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
