package revision1_9;

import java.util.Scanner;

public class Eg7 {

	public static void main(String[] args) {
		//Even Odd number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Entered number is Even");
		}
		else if(num%2!=0)
		{
			System.out.println("Entered numberis Odd");
		}
		sc.close();

	}

}
