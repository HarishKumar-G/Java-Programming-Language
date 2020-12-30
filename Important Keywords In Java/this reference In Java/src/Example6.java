/* Using 'this' as an argument in the constructor call */

class A {
	Example6 obj;
	
	A(Example6 obj) {
		this.obj = obj;
		obj.display();
	}
}


public class Example6 {
	int x = 5;

	Example6() {
		A obj = new A(this);
	}

	void display() {
		System.out.println("Value of x in class B : " + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example6 obj = new Example6();
	}
}
