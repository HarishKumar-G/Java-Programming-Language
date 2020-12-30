
public class Searching_for_characters_and_substring_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "GeekForGeeks is a computer science portal";
		
		int firstIndex = str.indexOf('s');
		System.out.println("First occurence of char 's' is found at: " + firstIndex);
		
		int lastIndex = str.lastIndexOf('s');
		System.out.println("Last occurence of char 's' is found at: " + lastIndex);
		
		int first_in = str.indexOf('s', 10);
		System.out.println("First occurence of char 's' after index 10 is: " + first_in);
		
		int last_in = str.lastIndexOf('s', 20);
		System.out.println("Last occurence of char 's' after index 20 is: " + last_in);
		
		int char_at = str.charAt(20);
		System.out.printf("Character at location 20: '%c'", char_at);
	}
}
