package java_prgs;

public class FirstandSecondHighestnumInArray {

	public static void main(String[] args) {
	
		int[] arr1 = {23,34,56,21,12,33,90,9,56,456,789,987};
		
		int max1 = arr1[0];
		int max2 = arr1[0];
		
		for(int i =0; i<arr1.length;i++)
		{
			if(arr1[i]>max1)
			{
				max2 = max1;
				max1= arr1[i];
			}
			
		}
		
System.out.println("First highest number in array = "+max1);
System.out.println("second highest number in arrar is = "+ max2);
	}

}
