package javaprgms;

public class ReverseString {

	public static void main(String[] args) {

		
//======================reverse a string======================
		
		String str = "shobha";

		String rev="";
		
		for(int i = str.length()-1; i>=0;i--)
		{
			rev=rev + str.charAt(i);
			
		}
		System.out.print(rev);

		
//============================reverse a number==================
		
//		int n = 2356567;
//		int rev;
//		//int rev1=0;
//		
//		while(n!=0)
//		{
//			rev = n%10;
//			n=n/10;
//			System.out.print(rev);
//		}
		
//==============================reverse string using string buffer==========================
//		
//		String str = "ShobhaAutomation";
//		
//		//StringBuffer str1 = new StringBuffer(str);
//		
//		StringBuilder str1 = new StringBuilder(str);
//		System.out.println(str1.reverse());
		
		
	}

}
