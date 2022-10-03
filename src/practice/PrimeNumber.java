package practice;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int counter=0;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				counter++;
				break;
			}
		}
		if(counter==1)
		{
			System.out.println("Given Number is Not a Prime Number");
		}
		else
		{
			System.out.println("Given Number is a Prime Number");
		}

	}

}
