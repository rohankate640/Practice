package controlStatement;

public class Else_ifUse {

	public static void main(String[] args) {
		
		String season="rainy";
		if(season=="summer")
		{
			System.out.println("Its very hot");
			
		}
		
		else if (season=="rainy") 
		{
			System.out.println("Its raining heavily");
			
		}
		
		else if (season=="winter")
		{
			System.out.println("Its very cold");
		}
		
		else
		{
			System.out.println("invalid season");
		}

	}

}
