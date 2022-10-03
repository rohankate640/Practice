package revision1_9;

public class PPEg3 {

	public static void main(String[] args) {
		//*****
		//****
		//***
		//**
		//*
		
		//row=5;column=5;star=5
		
		int row=5;
		int star=5;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star--;
			System.out.println();
		}

	}

}
