package javaprgms;

public class ReverseNum {

	public static void main(String[] args) {
		
		 int n = 23678;
		 int rev = 0;
		 while(n!=0)
		 {
		  rev  = rev*10 + n%10;
		 n = n/10;
		 
	}
		 System.out.print(rev);
	}

}
