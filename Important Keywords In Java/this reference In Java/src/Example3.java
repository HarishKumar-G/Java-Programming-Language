/* Java code for using 'this' keyword to return the current class instance */
public class Example3 {

	int a;
	int b;
	
	Example3() {
		a = 10;
		b = 20;
	}
	
	Example3 get() {
		return this;
	}
	
	void display() {
		System.out.println("a = " + a + " b = " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example3 obj = new Example3();
		obj.get().display();
	}
}
