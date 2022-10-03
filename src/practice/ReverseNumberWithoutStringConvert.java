package practice;

import java.util.Scanner;

public class ReverseNumberWithoutStringConvert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int number = sc.nextInt();
		int rev=0;
		for(int i=number;i>0;i=i/10)
		{
			int rem = i%10;
			rev=rev*10+rem;
		}
		System.out.println("Reverse number is "+rev);

	}

}
