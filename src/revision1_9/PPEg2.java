package revision1_9;

public class PPEg2 {

	public static void main(String[] args) {
		//*
		//**
		//***
		//****
		//*****
		
		//rows=5,column=5,star=1
		
		int row=5;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star++;
			System.out.println();
		}

	}

}
