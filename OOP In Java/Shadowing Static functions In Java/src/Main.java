/* Shadowing STATIC functions in JAVA */

class A {
	static void fun() {
		System.out.println("A.fun()");
	}
}

class B extends A {
	static void fun() {
		System.out.println("B.fun()");
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		a.fun();		// prints A.fun()
	}
}
