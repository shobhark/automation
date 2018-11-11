package javaprgms;

import java.util.HashMap;
//import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;

public class DuplicateElementsInArray {

	public static void main(String[] args) {
//	===============Duplicate String in given Array======================	
		//String[] names = {"java", "javascript", "c#", "php", "java", "php","Ruby", "Ruby"};
//			for(int i=0;i<names.length;i++)
//			{
//				for(int j=i+1;j<names.length;j++)
//				{
//					if(names[i].equals(names[j]))
//					{
//						System.out.println(names[j]+" is duplicate");
//					}
//				}
//			}
//			
//	==============Duplicate elements in given array===============================	
//	int[] num = {3,5,7,4,5,8,9,3,2,9};	
//	for(int i=0;i<num.length;i++)
//	{
//		for(int j=i+1;j<num.length;j++)
//		{
//			if(num[i]==num[j])
//			{
//				System.out.println(num[j]+" is duplicate");	
//			}
//		}
//	}
	
//=============================================================================
		
//		using hashset
		
		
		String[] names = {"java", "javascript", "c#", "php", "java", "php","Ruby", "Ruby"};
//		
//		Set<String> store= new HashSet<String>();
//		for(String name : names){
//			if(store.add(name) == false)
//			{
//			System.out.println("String is duplicate is : "+name);
//			}
//		}
//		//System.out.println(hs); 
	
//		using hashmap
		HashMap<String, Integer> hm= new HashMap<>();
		for(String name:names)
		{
			if(hm.containsKey(name)){
			hm.put(name, hm.get(name)+1);
			}else
			{
				hm.put(name, 1);
			}
				
			}
	Iterator<String> it = hm.keySet().iterator();
	while(it.hasNext())
	{
		String it1 = it.next();
		if(hm.get(it1)>1)
		{
			System.out.println("String is duplicate is : "+it1);
		}
	}
	
	}

}
