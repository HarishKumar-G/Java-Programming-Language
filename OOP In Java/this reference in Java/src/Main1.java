/* Java code for using this() to invoke current class constructor */

public class Main1 {
	
	int a, b;
	
	// default constructor
	Main1() {
		// TODO Auto-generated constructor stub
		this(10, 20);
		System.out.println("Inside default constructor \n");
	}
	
	// parameterized constructor
	Main1(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println("Inside parameterized constructor \n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main1();
	}
}
