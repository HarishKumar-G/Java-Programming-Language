/*
 * Java program to demonstrate "@Deprecated" annotation
 */

public class DeprecatedTest {

	@Deprecated
	public void Display() {
		System.out.println("DeprecatedTest display()");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeprecatedTest d1 = new DeprecatedTest();
		d1.Display();
	}
}
