package revision1_9;

import java.util.Scanner;

public class Eg9 {

	public static void main(String[] args) {
		//Prime Number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int counter=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				counter++;
				break;
			}
		}
		
		if(counter==1)
		{
			System.out.println("Entered number is Not a Prime Number ");
		}
		else
		{
			System.out.println("Entered number is a Prime Number ");
		}
		
		sc.close();
	}

}
