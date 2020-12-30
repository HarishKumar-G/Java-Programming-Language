/*
 * In Java, we can have an abstract class without any abstract method. This allows us to create classes that
 * cannot be instantiated, but can only be inherited.
 *
 */

// An abstract class without any abstract method
abstract class BaseCls {
	void fun() {
		System.out.println("Base fun() called"); 
	}
}

class DerivedCls extends BaseCls { }

public class AbstractClass_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedCls d = new DerivedCls();
		d.fun();
	}
}
