package revision27_9;

public class Pattern5 {

	public static void main(String[] args) {
//		A 
//		B B 
//		C C C 
//		D D D D 
//		E E E E E 
		
		//row=5;column=5;s=1
		int row=5;
		int s=1;
		int a=65;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=s;j++)
			{
				System.out.print((char)(a+i-1)+" ");
			}
			System.out.println();
			s++;
		}

	}

}
