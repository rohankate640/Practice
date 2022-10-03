package patternProgram;

public class Eg15 {

	public static void main(String[] args) {
//	     *****
//	    *****
//	   *****
//	  *****
//	 *****
		// row=5,space=4
		
		int space=4;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			System.out.print("*****");
			System.out.println();
			space--;
		}

	}

}
