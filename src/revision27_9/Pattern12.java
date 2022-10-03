package revision27_9;

public class Pattern12 {

	public static void main(String[] args) {
//	     1 
//	    2 2 
//	   3 3 3 
//	  4 4 4 4 
//	 5 5 5 5 5
		
		int row=5;
		int s=1;
		int space=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=s;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			space--;
			s++;
		}
	}

}
