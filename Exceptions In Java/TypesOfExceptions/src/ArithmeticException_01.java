/*
 * Java program to demonstrate ArithmeticException
 */

public class ArithmeticException_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 30, b = 0;
			int c = a / b;		// can not divide by zero
			System.out.println("Result = " + c);
		}
		catch (ArithmeticException e) {
			System.out.println("Can't divide a number by zero");
		}
	}
}
