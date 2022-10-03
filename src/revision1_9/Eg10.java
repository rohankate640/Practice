package revision1_9;

import java.util.Scanner;

public class Eg10 {

	public static void main(String[] args) {
		//Armstrong Number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
		}
		
		if(num==sum)
		{
			System.out.println("Entered number is Armstrong Number");
		}
		else
		{
			System.out.println("Entered number is Not a Armstrong number");
		}
		sc.close();

	}

}
