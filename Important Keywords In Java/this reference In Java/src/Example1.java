// Java code for using 'this' keyword to refer current class instance variables */
public class Example1 {
	int a;
	int b;
	
	Example1(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println("a = " + a + " b = " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example1 obj = new Example1(10, 20);
		obj.display();
	}
}
