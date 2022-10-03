package revision27_9;

public class Pattern18 {

	public static void main(String[] args) {
//		A B C D E 
//		A B C D 
//		A B C 
//		A B 
//		A
		
		int row=5;
		int a=65;
		
		for(int i=row;i>=1;i--)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(a+k-1)+" ");
			}
			System.out.println();
		
		}

	}

}
