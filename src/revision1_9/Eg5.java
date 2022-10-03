package revision1_9;

import java.util.Scanner;

public class Eg5 {

	public static void main(String[] args) {
		//Reverse the number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		String s = Integer.toString(num);
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		int revNum = Integer.parseInt(rev);
		System.out.println("Reverse number is "+revNum);
		sc.close();
	}

}
