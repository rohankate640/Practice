package revision1_9;

public class PPEg9 {

	public static void main(String[] args) {
		//row=5;column=9;star=5;space=0
		
		int row=5;
		int star=5;
		int space=0;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space++;
			star--;
		}

	}

}
