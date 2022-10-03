package revision27_9;

public class Pattern19 {

	public static void main(String[] args) {
//		E D C B A 
//		E D C B 
//		E D C 
//		E D 
//		E
		
		int row=5;
		int a=65;
		
		for(int i=1;i<=row;i++)
		{
			for(int k=row;k>=i;k--)
			{
				System.out.print((char)(a+k-1)+" ");
			}
			System.out.println();
		
		}

	}

}
