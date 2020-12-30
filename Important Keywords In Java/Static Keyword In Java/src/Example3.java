/* Java program to demonstrate execution of static blocks and variables */

public class Example3 {
	static int a = m1();
	
	static {
		System.out.println("Inside static block");
	}

	static int m1() {
		System.out.println("from m1");
		return 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Value of a : " + a);
		System.out.println("from main");
	}
}
