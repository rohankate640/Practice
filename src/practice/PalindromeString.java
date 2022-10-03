package practice;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		String r = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);
	
		if(s.equals(r))
		{
			System.out.println("Entered String is  Palindrome");
		}
		else
		{
			System.out.println("Entered String is Not Palindrome");
		}

	}

}
