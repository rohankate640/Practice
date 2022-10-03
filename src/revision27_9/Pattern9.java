package revision27_9;

public class Pattern9 {

	public static void main(String[] args) {
//	      A 
//	     A B 
//	    A B C 
//	   A B C D 
//	  A B C D E
		
		//row=5;column=9;a=1;space=4
		
		int row=5;
		int s=1;
		int a=65;
		int space=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=s;k++)
			{
				System.out.print((char)(a+k-1)+" ");
			}
			System.out.println();
			space--;
			s++;
		}
	}

}
