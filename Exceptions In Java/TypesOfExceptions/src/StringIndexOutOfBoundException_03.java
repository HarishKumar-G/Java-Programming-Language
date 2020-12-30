/*
 * Java program to demonstrate StringIndexOutOfBoundsException
 */

public class StringIndexOutOfBoundException_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String a = "This is like chipping "; // length is 22
			char c = a.charAt(24);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out Of Bounds Exception");
		}
	}
}
