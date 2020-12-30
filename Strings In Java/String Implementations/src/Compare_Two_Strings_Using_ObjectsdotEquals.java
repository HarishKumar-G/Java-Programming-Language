import java.util.Objects;

public class Compare_Two_Strings_Using_ObjectsdotEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = new String("GeeksforGeeks");
		String string2 = new String("Geeks");
		String string3 = new String("Geeks");
		String string4 = null;
		String string5 = null;
		
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + Objects.equals(string1, string2));
		System.out.println("Comparing " + string2 + " and " + string3 + " : " + Objects.equals(string2, string3));
		System.out.println("Comparing " + string1 + " and " + string4 + " : " + Objects.equals(string1, string4));
		System.out.println("Comapring " + string4 + " and " + string5 + " : " + Objects.equals(string4, string5));
	}
}
