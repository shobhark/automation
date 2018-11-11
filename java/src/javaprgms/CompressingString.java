package javaprgms;

public class CompressingString {
	
public static void compressString(String s1){
	s1 = "aaabbccccdd";
	int cnt = 0;
	char temp = s1.charAt(0);
	
	for(int i = 0;i<s1.length();i++)
	{
		if(s1.charAt(i)==temp)
		{
			cnt++;
		}else
			System.out.print(temp+" "+cnt);
		cnt =1;
		temp = s1.charAt(i);
	}
	
}
	public static void main(String[] args) {
		
//		compressString(String s1);
	}
}
