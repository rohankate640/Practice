package revision1_9;

public class PPEg13 {

	public static void main(String[] args) {
		//Double Hill
		//row=5;column=9;space1=2;star1=1;space2=2;star2=1
		
		int row=5;
		int space1=4;
		int star1=1;
		int space2=4;
		int space3=4;
		int star2=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			} 
			for(int j=1;j<=star1;j++)
			{
				System.out.print("* ");
			}
			for(int j=1;j<=space3;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star2;j++)
			{
				System.out.print("* ");
			}
		
			
			System.out.println();
			space1--;
			star1++;
			space2--;
			space3--;
			star2++;
		}
		
	

	}

}
