/*
 * Method Local Inner Classes
 * 
 * Inner class can be declared within a method of an outer class. In the following example, Inner is an
 * inner class in outerMethod()
 * 
 */

class Outerclass {
	void outerMethod() {
		System.out.println("Inside outerMethod");
		// Inner class is local to outer Method()
		class Inner {
			void innerMethod() {
				System.out.println("inside innerMethod");
			}
		}
		
		Inner y = new Inner();
		y.innerMethod();
	}
}

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outerclass x = new Outerclass();
		x.outerMethod();
	}
}
