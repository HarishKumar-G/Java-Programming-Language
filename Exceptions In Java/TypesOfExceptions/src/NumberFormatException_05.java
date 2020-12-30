/*
 * Java program to demonstrate NumberFormatException
 */

public class NumberFormatException_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// "akki" is not a number
			int num = Integer.parseInt("akki");
			System.out.println(num);
		} catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
	}
}
