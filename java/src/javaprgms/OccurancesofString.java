package javaprgms;

import java.util.HashMap;
import java.util.Iterator;

public class OccurancesofString {

	public static void main(String[] args) {
		
		String str = "i am shobha rani shobha want automation engineer want automation ";
		String[] strr=str.split(" ");
		HashMap<String, Integer> hm = new HashMap<>();
		for(String st : strr)
		{
			if(hm.containsKey(st))
			{
			hm.put(st, hm.get(st)+1);
			}else
				hm.put(st, 1);
		}
		//System.out.println(hm.keySet());
		Iterator<String> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			String itr = it.next();
			if(hm.get(itr)>1)
			{
				System.out.println("string " + itr +"  is repeating "+hm.get(itr)+ "  times");
			}
		}
	}

}
