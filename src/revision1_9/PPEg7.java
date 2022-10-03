package revision1_9;

public class PPEg7 {

	public static void main(String[] args) {
		//row=4;column=7;star=1;space=3
		
		int row=4;
		int star=1;
		int space=3;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}

	}

}
