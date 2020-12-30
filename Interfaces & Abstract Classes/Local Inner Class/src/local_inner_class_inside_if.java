/*
 * Java program to illustrate declaration of local inner classes inside an if statement
 */

public class local_inner_class_inside_if {

	public int data = 10;
	public int getData() {
		return data;
	}

	public static void main(String[] args) {
		local_inner_class_inside_if outer = new local_inner_class_inside_if();

		if (outer.getData() < 20) {
			// Local inner class inside if clause
			class Inner
			{
				public int getValue() {
					System.out.println("Inside Inner Class");
					return outer.data;
				}
			}

			Inner inner = new Inner();
			System.out.println(inner.getValue());
		}
		else {
			System.out.println("Inside Outer Class");
		}
	}
}
