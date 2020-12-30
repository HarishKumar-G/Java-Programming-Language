
public class Matching_String_Start_and_End {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "GeeksforGeeks is a computer science portal";
		
		System.out.println(str.startsWith("Geeks"));
		System.out.println(str.startsWith("is", 14));
		System.out.println(str.endsWith("port"));
	}
}
