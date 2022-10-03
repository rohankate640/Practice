package revision27_9;

public class Pattern23 {

	public static void main(String[] args) {
//	     A 
//	    A A 
//	   A B A 
//	  A C C A 
//	 A D F D A
		
		int row=5;
		int s=1;
		int space=4;
		int a=65;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			int temp=1;
			for(int k=1;k<=s;k++)
			{
				System.out.print((char)(a+temp-1)+" ");
				temp=temp*(i-k)/(k);
			}
			System.out.println();
			s++;
			space--;
		}

	}

}
