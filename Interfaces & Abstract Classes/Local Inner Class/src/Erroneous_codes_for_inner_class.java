/*
 * Java code to demonstrate that inner classes cannot be declared as static
 */

public class Erroneous_codes_for_inner_class {

	private int getValue(int data) {
//		static class Inner {
		class Inner {
			private int getData() {
				System.out.println("Inside inner class");
				if (data < 10) {
					return 5;
				} else {
					return 15;
				}
			}
		}
		
		Inner inner = new Inner();
		return inner.getData();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Erroneous_codes_for_inner_class outer = new Erroneous_codes_for_inner_class();
		System.out.println(outer.getValue(10));
	}
}
