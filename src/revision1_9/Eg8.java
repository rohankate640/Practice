package revision1_9;

import java.util.Scanner;

public class Eg8 {

	public static void main(String[] args) {
		//Factorial of a number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		sc.close();
	}

}
