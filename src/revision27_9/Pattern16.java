package revision27_9;

public class Pattern16 {

	public static void main(String[] args) {
//		5 
//		5 4 
//		5 4 3 
//		5 4 3 2 
//		5 4 3 2 1
		
		int row=5;
		
		for(int i=row;i>=1;i--)
		{
			for(int k=row;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
