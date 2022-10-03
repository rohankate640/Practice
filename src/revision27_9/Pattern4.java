package revision27_9;

public class Pattern4 {

	public static void main(String[] args) {
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 
		
		//row=5;column=5;s=1
		int row=5;
		int s=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=s;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			s++;
		}

	}

}
