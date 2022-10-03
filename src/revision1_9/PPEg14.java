package revision1_9;

public class PPEg14 {

	public static void main(String[] args) {
		// Diamond
		//row=7;column=5;space=3;star=1
		
		int row=7;
		int space=3;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
			if(i<4)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
		  
		}
		

	}

}
