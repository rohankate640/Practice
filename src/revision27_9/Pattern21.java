package revision27_9;

public class Pattern21 {

	public static void main(String[] args) {
//		A 
//		B C 
//		D E F 
//		G H I J 
//		K L M N O
		
		int row=5;
		int a=65;
		
		for(int i=1;i<=row;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(a)+" ");
				a++;
			}
			System.out.println();
		}

	}

}
