package javaprgms;

public class SpecialCharINStr {

	public static void main(String[] args) {
		String st = "hj&dsh$cd#jhk";
		char[] str = st.toCharArray();
		
		int r = str.length - 1, l = 0; int cnt = 0;
		int cnt1 = 0;
		
		    // Traverse string from both ends until 
		    // 'l' and 'r' 
		    while (l < r) 
		    { 
		        // Ignore special characters 
		        if (!Character.isAlphabetic(str[l])) 
		        {	
		            l++; 
		        cnt++;
		        }
		        else if(!Character.isAlphabetic(str[r])){
		            r--; 
		        cnt1++;
		        }
		        // Both str[l] and str[r] are not special 
		        else 
		        { 
		            char tmp = str[l]; 
		            str[l] = str[r]; 
		            str[r] = tmp; 
		            l++; 
		            r--; 
		        } 
		       
		    } 
		    System.out.print(str);
		    System.out.println();
		   // System.out.println("no.of special characters in a given string is " +cnt+cnt1);
	}

}
