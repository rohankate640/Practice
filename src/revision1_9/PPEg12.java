package revision1_9;

public class PPEg12 {

	public static void main(String[] args) {
		//row=9;column=10;star=1;star2=1;space=4;space2=4
		
		int row=9;
		int star=1;
		int space=4;
		int space2=4;
		int star2=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=space2;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star2;k++)
			{
				System.out.print("*");
			}

			System.out.println();
			
			if(i<5)
			{
				star++;
				space--;
				space2--;
				star2++;
			}
			else
			{
				star--;
				space++;
				space2++;
				star2--;
			}
		}

	}

}
