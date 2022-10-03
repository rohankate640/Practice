package revision27_9;

public class Pattern1 {

	public static void main(String[] args) {
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5
		
		//row=5,column=5,s=1
		int row=5;
		int s=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=s;j++)
			{
				
				System.out.print(j+" ");
				
			}
			System.out.println();
			s++;
		}

	}

}
