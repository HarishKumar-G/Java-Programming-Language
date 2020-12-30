/*
 * Java program to demonstrate GC when Nullifying the reference variable
 */

public class Nullifying_The_Reference_Variable {
	
	String obj_name;
	
	public Nullifying_The_Reference_Variable(String name) {
		this.obj_name = name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reassigning_The_Reference_Variable obj1 = new Reassigning_The_Reference_Variable("obj1");
		
		// when obj1 is no more useful, obj1 is being nullified
		obj1 = null;
		
		// calling Garbage Collector
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.obj_name + " successfully garbage collected");
	}
}
