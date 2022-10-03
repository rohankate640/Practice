package revision1_9;

import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) {
		//Multiplication without Multiplication operator

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter number2 ");
		int num2 = sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=num2;i++)
		{
			sum=sum+num1;
		}
		System.out.println("Multiplication is "+sum);
		sc.close();
		
	}

}
