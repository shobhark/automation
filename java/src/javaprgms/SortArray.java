package javaprgms;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr = {3,6,87,-5,9};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		}
		

}
