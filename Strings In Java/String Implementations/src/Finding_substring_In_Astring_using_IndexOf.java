
public class Finding_substring_In_Astring_using_IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "GeeksforGeeks is a computer science portal";
		
		int firstIndex = str.indexOf("Geeks");
		System.out.println("First occurence of substring Geeks is found at: " + firstIndex);
		
		int lastIndex = str.lastIndexOf("Geeks");
		System.out.println("Last occurence of char substring is found at: " + lastIndex);
	
		int first_in = str.indexOf("Geeks", 10);
		System.out.println("First occurence of char substring after index 10: " + first_in);
		
		int last_in = str.lastIndexOf("Geeks", 20);
		System.out.println("Last occurence of char substring after the index 20: " + last_in);	
	}
}
