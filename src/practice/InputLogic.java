package practice;

import java.util.Scanner;

public class InputLogic {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd Number");
		int num2 = sc.nextInt();
		int sum = num1+num2;
		System.out.println("Addition is "+sum);
		
		System.out.println("Enter your Full Name");
		String name = sc.next();
		System.out.println("Full Name is "+name);
		sc.close();
	}

}
