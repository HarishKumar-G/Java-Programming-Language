/*
 * Java program to demonstrate Integer.parseInt() method
 */

public class parseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// parsing different strings
		int z = Integer.parseInt("654", 8);
		int a = Integer.parseInt("-FF", 16);
		long l = Long.parseLong("2158611234", 10);
		
		System.out.println(z);
		System.out.println(a);
		System.out.println(l);
		
		// run-time NumberFormatException will occur here
		// "Geeks" is not a parsable String
		int x = Integer.parseInt("Geeks", 8);
		
		// run-time NumberFormatException will occur here
		// (for octal(8), allowed digits are [0-7])
		int y = Integer.parseInt("99", 8);
	}
}
