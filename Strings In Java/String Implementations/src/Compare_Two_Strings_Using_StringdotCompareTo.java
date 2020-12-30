
public class Compare_Two_Strings_Using_StringdotCompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = new String("GeeksforGeeks");
		String string2 = new String("Practice");
		String string3 = new String("Geeks");
		String string4 = new String("Geeks");
		
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + string1.compareTo(string2));
		System.out.println("Comparing " + string3 + " and " + string4 + " : " + string3.compareTo(string4));
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + string1.compareTo(string4));
	}
}
