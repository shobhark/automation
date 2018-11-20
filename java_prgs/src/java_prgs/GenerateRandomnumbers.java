package java_prgs;

import java.util.Random;

public class GenerateRandomnumbers {

	
	public static void randomnum()
	{
		Random rnm = new Random();
		for(int i=10;i<30;i++)
		{
			int rnm1 = rnm.nextInt(45);
			System.out.println(rnm1);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		randomnum();
	}

}
