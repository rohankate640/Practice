package practice;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		String s = Integer.toString(num);
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		int revNumber = Integer.parseInt(r);
		System.out.println("Original number is "+num);
		System.out.println("Reverse number is "+revNumber);
	}

}
