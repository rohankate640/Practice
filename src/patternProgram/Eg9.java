package patternProgram;

public class Eg9 {

	public static void main(String[] args) {
		//row=4;star=1;space=3
//		    * 
//		   * * 
//		  * * * 
//		 * * * * 

		
		int star=1;
		int space=3;
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}

	}

}
