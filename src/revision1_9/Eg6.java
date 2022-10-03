package revision1_9;

import java.util.Scanner;

public class Eg6 {

	public static void main(String[] args) {
		//Reverse the number without string convert
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rev=0;
		
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		sc.close();
	}

}
