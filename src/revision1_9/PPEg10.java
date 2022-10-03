package revision1_9;

public class PPEg10 {

	public static void main(String[] args) {
		//row=9;column=5;star=5
		
		int row=9;
		int star=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if(i<5)
			{
				star--;
			}
			else
			{
				star++;
			}
		}


	}

}
