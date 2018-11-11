package javaprgms;

public class PrimeNum {

	
	public void isPrime(int num)
	{
		for(int i=1;i<num/2;i++){
		if(num%i==0)
		{
			System.out.println("given number  "+num+" : not prime");
			break;
		}else{
			System.out.println("given number  "+num+" : prime");
		}
		}
		
	}
	
	public static void main(String[] args) {
		
		PrimeNum pnm = new PrimeNum();
		pnm.isPrime(83);
		

	}

}
