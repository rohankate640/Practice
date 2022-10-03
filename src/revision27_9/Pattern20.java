package revision27_9;

public class Pattern20 {

	public static void main(String[] args) {
//		E 
//		E D 
//		E D C 
//		E D C B 
//		E D C B A
		
		int row=5;
		int a=65;
		
		for(int i=row;i>=1;i--)
		{
			for(int k=row;k>=i;k--)
			{
				System.out.print((char)(a+k-1)+" ");
			}
			System.out.println();
		}
	}
}
