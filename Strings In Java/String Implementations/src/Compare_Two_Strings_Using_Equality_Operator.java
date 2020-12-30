
public class Compare_Two_Strings_Using_Equality_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("HELLO");
		String s2 = new String("HELLO");
		
		System.out.println(s1 == s2); // FALSE: Because the references of the objects s1 and s2 are compared
		System.out.println(s1.equals(s2));
	}
}
