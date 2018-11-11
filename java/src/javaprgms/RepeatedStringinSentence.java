package javaprgms;

import java.util.HashMap;

import java.util.Set;

public class RepeatedStringinSentence {

	public static void main(String[] args) {
		String str = "my name is shobha name rani is automation is rani";
		String[] str1=str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		
		for(String st:str1)
		{
			
			if(hm.containsKey(st))
			{
			hm.put(st, hm.get(st)+1);
			}
			else
			{
				hm.put(st, 1);
			}
			
		}
		
		Set<String> keys = hm.keySet();
	
		for(String sting:keys)
		{
			if(hm.get(sting)>1)
			{
				System.out.println("occurances of "+sting+"  is"+hm.get(sting));
			}
		}
	}

}
