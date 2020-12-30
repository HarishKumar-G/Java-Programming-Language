/*
 * An example of abstract class in Java
 *
 *	abstract class Shape {
 *		int color;
 *	
 *		// An abstract function (like a pure virtual funtion in C++)
 *		abstract void draw();
 *	}
 *
 * Like in C++, in Java, an instance of an abstract class cannot be created, 
 * we can have references of abstract class type though.
 *
 */

abstract class Base {
	abstract void fun();
}

class Derived extends Base {
	void fun() {
		System.out.println("Derived fun() called");
	}
}

public class AbstractClass_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base b = new Derived();
		b.fun();
	}
}
