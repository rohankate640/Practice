package revision1_9;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {
		//Reverse String; 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String ");
		String s = sc.next();
		
		String r = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("Reverse String is "+r);
		sc.close();

	}

}
