package javaprgms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharInString {
	
	static char ch;

	public static void main(String[] args) {

	String str = "shobharanikasukurthi";
	
	char[] chars = str.toCharArray();
	
	Map<Character, Integer> cm = new HashMap<>();
	
	for(Character ch : chars)
	{
		if (cm.containsKey(ch))
		{
		cm.put(ch, cm.get(ch)+1);
		
		}
		else
		{
			cm.put(ch, 1);
		}
		
	}
	System.out.println(cm);
	if(cm.get(ch)>1)
	{
		System.out.println(cm);
	}
	}
	
}
