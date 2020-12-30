/*
 * Like C++, an abstract class can contain constructors in Java. And a constructor of abstract class is 
 * called when an instance of a inherited class created. For example, the following is a valid Java program.
 * 
 */


// An abstract class with constructor
abstract class BaseClass {
	BaseClass() { System.out.println("Base Constructor Called"); }
}

class DerivedClass extends BaseClass {
	DerivedClass() { System.out.println("Derived Constructor Called"); }
	void fun() { System.out.println("Derived fun() called"); }
}

public class AbstractClass_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DerivedClass d = new DerivedClass();
	}
}
