package revision27_9;

public class Pattern8 {

	public static void main(String[] args) {
//	     5 
//	    4 5 
//	   3 4 5 
//	  2 3 4 5 
//	 1 2 3 4 5
		
		//row=5;column=9;s=1;space=4
		int row=5;
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=row;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		
		}

	}

}
