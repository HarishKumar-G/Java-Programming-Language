/*
 * Java code to demonstrate the scope of inner class
 * 
 * The above program causes compilation error because the scope of inner classes is restrcted to the block 
 * they are defined in.
 */

public class Scope_of_inner_class {

	private void myMethod() {
		class Inner
		{
			private void innerMethod(){
				System.out.println("Inside inner class");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scope_of_inner_class outer = new Scope_of_inner_class();
		Inner inner = new Inner();
		System.out.println(inner.innerMethod());
	}
}
