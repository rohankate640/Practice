package revision27_9;

public class Pattern13 {

	public static void main(String[] args) {
//	     A 
//	    B B 
//	   C C C 
//	  D D D D 
//	 E E E E E
		
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
				System.out.print((char)(a+i-1)+" ");
			}
			System.out.println();
			space--;
			s++;
		}

	}

}
