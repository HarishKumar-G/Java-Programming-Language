// An abstract class with a final method

abstract class BClass {
	final void fun() { System.out.println("Derived fun() called"); }
}

class DClass extends BClass { }

public class AbstractClass_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BClass b = new DClass();
		b.fun();
	}
}
