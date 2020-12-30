/*
 * Java program to demonstrate "@override" annotation
 */

class baseclass {
	public void Display() {
		System.out.println("Base Display()");
	}
	
	public static void main(String args[]) {
		baseClass t1 = new Override_Annotation();
		t1.Display();
	}
}

public class Override_Annotation extends base {
	@Override
	public void Display() {
		System.out.println("Derived display()");
	}
}
