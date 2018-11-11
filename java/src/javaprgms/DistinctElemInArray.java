package javaprgms;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class DistinctElemInArray {



	public static void main(String[] args) {
		
		int[] arr = {2,4,3,2,6,4,7,8,7,8};
		Set<Integer> hs = new HashSet<>();
//		using array
//===========================================================
//		for(int i=0;i<arr.length;i++){
//		boolean isDistinct = false;
//		
//		for(int j=0;j<i;j++)
//		{
//			if(arr[i] == arr[j])
//			{
//				isDistinct = true;
//				break;
//		}
//		}
//		if(!isDistinct)
//		System.out.print(arr[i]+",");
//		}
//		using hashtable
		for(int a:arr){
		
		hs.add(a);
		}
		System.out.println(hs);
	}
}


