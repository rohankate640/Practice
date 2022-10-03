package revision27_9;

public class Pattern7 {

	public static void main(String[] args) {
//	     1 
//	    1 2 
//	   1 2 3 
//	  1 2 3 4 
//	 1 2 3 4 5
		
		//row=5;column=5;star=1;space=2
		
		int row=5;
		int star=1;
		int space=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			space--;
			star++;
		}

	}

}
