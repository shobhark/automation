
public class ReverseString {

	public static void main(String[] args) {

		String str = "java   programs";
		
		String[] words = str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			String word = words[i];
			String revWord = " ";
			
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord = revWord+word.charAt(j);
			}
			System.out.print(revWord);
			
			
			
		}
		
		
		
		
		
	}

}
