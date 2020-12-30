
public class Finding_substring_in_Astring_using_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "software";
		
		CharSequence seq = "soft";
		boolean bool = test.contains(seq);
		System.out.println("Found soft?: " + bool);
		
		boolean seqFound = test.contains("war");
		System.out.println("Found war?: " + seqFound);
		
		boolean sqFound = test.contains("wr");
		System.out.println("Found wr?: " + sqFound);
	}
}
