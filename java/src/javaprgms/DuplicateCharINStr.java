package javaprgms;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharINStr {
	
	
	public static void main(String[] args) {
		String str = "shobharanikasukurthiautomation";
		char [] chars = str.toCharArray();
		
		HashMap<Character, Integer> hm = new HashMap<>();
		
		for(char ch:chars)
		{
			
			if(hm.containsKey(ch))
			{
			hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
			
		}
	 Set<Character> keys = hm.keySet();
	 System.out.println(keys);
	 System.out.println(hm);
	 
	for(Character ch:keys)
	{
		if(hm.get(ch)>1)
		{
			System.out.println("occurance of   "+ ch+"   in given String is -------"+hm.get(ch)+"times");
		}
	}
	 
	}
	}


