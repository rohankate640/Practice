package revision27_9;

public class Pattern10 {

	public static void main(String[] args) {
//	      E 
//	     D E 
//	    C D E 
//	   B C D E 
//	  A B C D E
		
		int row=5;
		int a=65;
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=row;k++)
			{
				System.out.print((char)(a+k-1)+" ");
			}
			System.out.println();
		}

	}

}
