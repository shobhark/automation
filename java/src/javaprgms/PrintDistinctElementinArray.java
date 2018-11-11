package javaprgms;

public class PrintDistinctElementinArray {

	public static void main(String[] args) {
		
		
		int arr[] = {5,2,7,8,8,6,9,5};
		boolean isDistinct = false;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<i;j++)
			{
				
			if(arr[i]==arr[j])
			{
				isDistinct=true;
				break;
			}
			
			}
			if(!isDistinct)
			{
				System.out.print(arr[i]+",");
			}
		}
		
		
	}

}
