package revision27_9;

public class Pattern15 {

	public static void main(String[] args) {
//		5 4 3 2 1 
//		5 4 3 2 
//		5 4 3 
//		5 4 
//		5 
		
		int row=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int k=row;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}


	}

}
