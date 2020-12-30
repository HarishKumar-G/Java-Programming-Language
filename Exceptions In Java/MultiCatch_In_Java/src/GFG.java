/*
 * A java program to demonstrate that we needed multiple catch blocks
 * for multiple exceptions prior to Java 7.
 */

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		try {
			int n = Integer.parseInt(scn.nextLine());
			if (99%n == 0)
				System.out.println(n + " is a factor of 99");
		}
		catch (ArithmeticException ex) {
			System.out.println("Arithmetic " + ex);
		}
		catch (NumberFormatException ex)
		{
			System.out.println("Number Format Exception " + ex);
		}
	}
}
