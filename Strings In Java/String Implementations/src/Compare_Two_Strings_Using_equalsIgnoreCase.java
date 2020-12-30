
public class Compare_Two_Strings_Using_equalsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = new String("GeeksforGeeks");
		String string2 = new String("Practice");
		String string3 = new String("Geeks");
		String string4 = new String("Geeks");
		String string5 = new String("geeks");
		
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + string1.equalsIgnoreCase(string2));
		System.out.println("Comparing " + string3 + " and " + string4 + " : " + string3.equalsIgnoreCase(string4));
		System.out.println("Comparing " + string4 + " and " + string5 + " : " + string4.equalsIgnoreCase(string5));
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + string1.equalsIgnoreCase(string4));
	}
}
