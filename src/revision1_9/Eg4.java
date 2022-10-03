package revision1_9;

public class Eg4 {

	public static void main(String[] args) {
		// count number of White spaces in string
		
		String s="India is my country";
		
		int counter=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if(blank==' ')
			{
				counter++;
			}
		}
		System.out.println("Number of whitespaces in "+s+" are "+counter);

		
	}

}
