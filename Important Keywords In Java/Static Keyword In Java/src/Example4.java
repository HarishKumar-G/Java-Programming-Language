/* Java program to demonstrate restriction on static methods */

public class Example4 {

	static int a = 10;
	int b = 20;
	
	static void m1() {
		a = 20;
		System.out.println("from m1");
		
		// cannot make a static reference to the non-static field b
//		b = 10;
	
		// cannot make a static reference to the non-static method m2() from the type test
//		m2();	// compiler error
		
		// cannot use super in a static context
//		System.out.println(super.a);
	}
	
	void m2() {
		System.out.println("from m2");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	}
}
