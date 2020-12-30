/* Java code for using 'this' keyword as method parameter */

public class Example4 {

	int a;
	int b;
	
	Example4()
	{
		a = 10;
		b = 20;
	}
	
	void display(Example4 obj) {
		System.out.println("a = " + a + " b = " + b);
	}
	
	void get() {
		display(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example4 obj = new Example4();
		obj.get();
	}
}
