/*
 * Java program to demonstrate GC when one object referred to other object
 */

public class Reassigning_The_Reference_Variable {
	
	String obj_name;
	
	public Reassigning_The_Reference_Variable(String name) {
		this.obj_name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reassigning_The_Reference_Variable obj1 = new Reassigning_The_Reference_Variable("obj1");
		Reassigning_The_Reference_Variable obj2 = new Reassigning_The_Reference_Variable("obj2");
		
		// obj1 now referred to obj2
		obj1 = obj2;
		
		// calling Garbage Collector
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
