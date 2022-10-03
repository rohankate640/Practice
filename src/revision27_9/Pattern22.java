package revision27_9;

public class Pattern22 {

	public static void main(String[] args) {
//		    1 
//		   1 1 
//		  1 2 1 
//		 1 3 3 1 
//		1 4 6 4 1
		
		int row=5;
		int s=1;
		int space=4;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			int temp=1;
			for(int k=1;k<=s;k++)
			{
				System.out.print(temp+" ");
				temp=temp*(i-k)/(k);
			}
			System.out.println();
			s++;
			space--;
		}

	}

}
