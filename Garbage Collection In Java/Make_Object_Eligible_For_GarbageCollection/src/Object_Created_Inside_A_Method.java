/*
 * Java program to demonstrate that objects created inside a method will become eligible for GC
 * after method execution termination
 */

public class Object_Created_Inside_A_Method {

	String obj_name;
	
	public Object_Created_Inside_A_Method(String name) {
		this.obj_name = name;
	}
	
	static void show() {
		// object obj1 inside method becomes unreachable when show() removed
		Object_Created_Inside_A_Method obj1 = new Object_Created_Inside_A_Method("obj1");
		display();
	}
	
	static void display() {
		// object obj2 inside method becomes unreachable when display() removed
		Object_Created_Inside_A_Method obj2 = new Object_Created_Inside_A_Method("obj2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show();
		
		// System.gc();
		Runtime.getRuntime().gc();
	}
	@Override
	/* Overriding finalize method to check which object is garbage collected */
	protected void finalize() throws Throwable {
		// will print the name of object
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
