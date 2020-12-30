/* Java code for using 'this()' to invoke current class constructor */

public class Example2 {

	int a;
	int b;
	
	Example2() {
		this(10, 20);
		System.out.println(" Inside default constructor \n");
	}
	
	Example2(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(" Inside parameterized constructor \n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example2 object = new Example2();
	}
}
