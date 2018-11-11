package openBrowser;

import java.util.ArrayList;

public class Permitations {

	public static void main(String[] args) {
		
		Permitations per = new Permitations();
		 ArrayList<String> results = per.permutations("abc");
		System.out.println(results);
			
	}
	
	public ArrayList<String> permutations(String s)
	{
		ArrayList<String> results = new ArrayList<>();
		permutations("","abc", results);
		return results;
	}
	
	public void permutations(String prefix, String suffix, ArrayList<String> results )
	{
		if(suffix.length()==0)
		{
			results.add(prefix);
		}
		else{
			for(int i=0;i<suffix.length();i++)
			{
				permutations(prefix+suffix.charAt(i), suffix.substring(0, i) + suffix.substring(i+1, suffix.length()), results);
			}
		}
	}
}
