import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Duplicates {

	public static void main(String[] args) {
		
		String str = "shobha automation test engineer automation";
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> hm = new HashMap<Character, Integer>(); 
		
		for(Character chh : ch)
		{
			if(hm.containsKey(chh))
			
				hm.put(chh, hm.get(chh)+1);
				else
					hm.put(chh, 1);
			
		}
		
		Iterator<Character> it = hm.keySet().iterator();
		while(it.hasNext())
		{
			char chr = it.next();
			if(hm.get(chr)>1)
			{
				System.out.println(chr+"  repeating  "+hm.get(chr)+" times");
			}
		}
		

	}

}
