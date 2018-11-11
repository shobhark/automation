package javaprgms;

public class MissingNumInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,8,9};
		
		int sum = 0;
		
		for(int i = 0; i<arr.length;i++)
		{
			sum = sum+arr[i];
		}
		
		System.out.println("sum of given array is " +sum);
		int sum1=0;
		for(int j=1;j<=9;j++)
		{
			sum1=sum1+j;
		}
System.out.println("missing number in given array is  ::"+(sum1-sum));
	}

}
