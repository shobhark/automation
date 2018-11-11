package javaprgms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
//		fibonacciSeries
//		0 1 1 2 3 5 8 13 21 34 55 89
		
		int firstNum = 0;
		int secNum = 1;
		for(int i = 0; i<=10;i++)
		{
			int thirdNum = firstNum + secNum;
			System.out.println(thirdNum);
			firstNum = secNum;
			secNum = thirdNum;
		}
		

	}

}
