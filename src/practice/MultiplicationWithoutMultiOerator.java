package practice;

import java.util.Scanner;

public class MultiplicationWithoutMultiOerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd value");
		int num2 = sc.nextInt();
		int sum=0;
		for(int i=1;i<=num2;i++)
		{
		    sum=sum+num1;
		}
		System.out.println("Multiplication of two values is "+sum);

	}

}
