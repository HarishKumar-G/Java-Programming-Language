/*
 * Java program to demonstrate GC to destroy anonymous objects
 */

public class Anonymous_Object{
	
	String obj_name;
	
	public Anonymous_Object(String name) {
		this.obj_name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating an anonymous object
		new Reassigning_The_Reference_Variable("obj1");
		
		// calling Garbage Collector
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
