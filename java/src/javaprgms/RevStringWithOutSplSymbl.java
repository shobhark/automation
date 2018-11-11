package javaprgms;

public class RevStringWithOutSplSymbl {

	public static void main(String[] args) {
		
		
		String st = "@jgcdhsa%djs$db8*";
		
		char[] str = st.toCharArray();
		
		int r = str.length-1;
		int l = 0;
		int cnt = 0;
		
		while(l < r)
		{
			if(!Character.isAlphabetic(str[l])){
				l++;
			cnt++;
			}
			else if(!Character.isAlphabetic(str[r]))
			{
				r--;
			cnt++;
			}
			
			else
			{
				char temp = str[l];
				str[l] = str[r];
				str[r] = temp;
			}
		}
		
System.out.println(str);
System.out.println("no.of special characters in a given string is " +cnt);
	
}
}
