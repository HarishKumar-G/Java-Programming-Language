/*
 * Java program to demonstrate static method in Interface
 */

interface NewInterface {
	// static method
	static void hello() {
		System.out.println("Hello, New Static Method Here");
	}
	
	// Public and abstract method of interface
	void overrideMethod(String str);
}

// implementation class
public class GFG implements NewInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GFG interfaceDemo = new GFG();
		
		//  calling the static method of interface
		NewInterface.hello();
		
		// calling the abstract method of interface
		interfaceDemo.overrideMethod("Hello, Override Method here");
	}
	
	// Implementing interface method
	
	@Override
	public void overrideMethod(String str) {
		System.out.println(str);
	}
}
