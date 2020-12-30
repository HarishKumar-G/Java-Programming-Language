/* Java program to demonstrate that a static member
 * can be accessed before instantiating a class */

public class Example1 {
	
	static void m1() {
		System.out.println("From m1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// calling m1 without creating any object of class Test
		m1();
	}
}
