package javaprgms;

import java.util.HashMap;
import java.util.Iterator;


public class DuplicateLettersinString {

	public static void main(String[] args) {
	
		String strng = "shobharaniislearningautomation";
		char[] ch=strng.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
			for(Character chr:ch)
			{
				if(hm.containsKey(chr))
						hm.put(chr, hm.get(chr)+1);
				else
						hm.put(chr, 1);
				}
			
	Iterator<Character> it = hm.keySet().iterator();
	
	while(it.hasNext())
	{
		char chh = it.next();
		if(hm.get(chh)>1)
		{
			System.out.println(chh + " : is reapeating " + hm.get(chh) +"  times");
		}
	}
	
	}
	
	}


