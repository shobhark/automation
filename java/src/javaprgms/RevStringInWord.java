package javaprgms;

public class RevStringInWord {

	public static void main(String[] args) {
		
		String str = "java program";
		String[] strarray = str.split(" ");
		
		for(int i=0;i<strarray.length;i++)
		{
			String word = strarray[i];
			String revWord = " ";
			for(int j=word.length()-1;j>=0;j--)
			{
				revWord = revWord+word.charAt(j);
			}
			System.out.print(revWord);
		}

	}

}
