/*
 * Java program to demonstrate scope of static method in interface
 */

/*
 * In this program, the scope of the static method defintion is within the interface only. If same name 
 * method is implemented in the implementation class then that method becomes a static member of that 
 * respective class.
 */

interface PrintDemo {
	// static method
	static void hello() {
		System.out.println("Called from Interface PrintDemo");
	}
}

public class Scope_Of_Static_Method_In_Interface implements PrintDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Call Interface method as interface name is preceeding with method
		 */
		PrintDemo.hello();
		
		// Call class static method
		hello();
	}
	
	// class static method is defined
	static void hello() {
		System.out.println("Called from class");
	}
}
