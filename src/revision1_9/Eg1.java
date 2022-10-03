package revision1_9;

import java.util.Scanner;

public class Eg1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number1 ");
		int num1 = sc.nextInt();
		System.out.println("Please enter number2 ");
		int num2 = sc.nextInt();
		int sum=num1+num2;
		System.out.println("Addition of 2 numbers is "+sum);
		sc.close();
	}

}
