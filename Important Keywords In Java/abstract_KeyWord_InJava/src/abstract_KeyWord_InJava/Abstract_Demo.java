package abstract_KeyWord_InJava;

abstract class A {
	abstract void m1();
	void m2() {
		System.out.println("This is a concrete method");
	}
}

class B extends A {
	void m1() {
		System.out.println("B's implementation of m1.");
	}
}

public class Abstract_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.m1();
		b.m2();
	}

}
