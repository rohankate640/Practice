package practice;

public class WhiteSpacesFromString {

	public static void main(String[] args) {
		String s="My name is Rohan";
		int counter=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if(blank==' ')
			{
				counter++;
			}
		}
		System.out.println("Number of Blank space in "+s+" is "+counter);
	}

}
