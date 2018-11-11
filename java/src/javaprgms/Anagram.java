package javaprgms;

public class Anagram {

	public void isAnagram(String a1, String a2)
	{
		char[] chars = a1.toCharArray();
		StringBuilder secondString = new StringBuilder(a2);
		for(char ch :chars)
		{
			int indx = a2.indexOf(ch);
			System.out.println(indx);
//			if index not found index we will get -1
			if(indx!=-1)
			{
				secondString.deleteCharAt(indx);
			}
		}
		if(secondString.length() == 0)
		{
			System.out.println("given String is Anagram");
		}else{
			System.out.println("given String is not Anagram");
		}

	}
	
	public static void main(String[] args) {
		
		Anagram angrm = new Anagram();
		angrm.isAnagram("sdge", "geds");
	}

}
