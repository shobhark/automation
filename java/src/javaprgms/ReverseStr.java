package javaprgms;

public class ReverseStr {

	public static void main(String[] args) {
		
//-------one method-----------------
		String str = "shobhautomation";
//		
//		for(int i=str.length()-1;i>=0;i--)
//		{
//			System.out.println(str.charAt(i));
//		}
		
//--------------2nd method----------------------
		
//	StringBuffer stb = new StringBuffer(str);
//	System.out.print(str);
//	System.out.println(" ");
//	System.out.print(stb.reverse());

	

	//private String str;
	
//----------3rd method------------
StringBuilder stbl=new StringBuilder(str);
System.out.println(str);
System.out.println(stbl.reverse());
	}
}
