/* Java program to demonstrate use of static blocks */

public class Example2 {

	// static variable
	static int a = 10;
	static int b;

	// static block
	static {
		System.out.println("Static block initialized.");
		b = a * 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("from main");
		System.out.println("Value of a: " + a);
		System.out.println("Value of b: " + b);
	}
}
