package javaprgms;

public class RemoveJunkValues {

	public static void main(String[] args) {
	
		String str = "#@^~*#@&! ajsghds fjdheueh @#bhdfjq SG#$#hjk";
		str = str.replaceAll("[^a-zA-Z 0-9]", "");
		System.out.println(str);
	}

}
