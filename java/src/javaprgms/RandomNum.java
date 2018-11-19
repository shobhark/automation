package javaprgms;

import java.util.Random;

public class RandonNum {

	public void randonNum()
	{
		Random rndm = new Random();
		for(int i = 0;i<=10;i++)
		{
			int num = rndm.nextInt(35);
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		RandonNum rn = new RandonNum();
		rn.randonNum();

	}
 
}
