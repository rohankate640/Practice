package revision27_9;

public class Pattern14 {

	public static void main(String[] args) {
//		1 2 3 4 5 
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1
		
		int row=5;
		int s=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=s;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
			s--;
		}


	}

}
