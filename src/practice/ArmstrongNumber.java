package practice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number=sc.nextInt();
		int sum=0;
		for(int i=number;i>0;i=i/10)
		{
			int rem = i%10;
			sum=sum+(rem*rem*rem);
		}
		System.out.println(sum);
		
		if(number==sum)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
		{
			System.out.println("Given number is Not a Armstrong number");
		}

	}

}
