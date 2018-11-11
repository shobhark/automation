package timecomplexity;

public class TimeComplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 2;
//		int p=1;
//		
////time complexity will be O(n^3)		
//		for(int i =0; i<n;i++)
//		{
//			for(int j=0;j<n;j++)
//			{
//				for(int k = 0; k<n; k++)
//				{
//					System.out.println(p++);
//				}
//			}
//		}
//=========================================================
		
//int n = 100;
//int i=0;
//while(n>=1)
//{
//	n = n-20;
//	System.out.println(i++);
//}
		
		int n= 128;
		int i= 0;
		while(n>1)
		{
			n = n / 2;
			i=i+1;
		}
		
		System.out.println(i);	
		
	
	}
}
