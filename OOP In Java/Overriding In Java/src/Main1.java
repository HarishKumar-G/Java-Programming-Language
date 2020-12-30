/* Java program to demonstrate Overriding and Access-Modifiers */

class Parent1 {
	
	// private methods are not overridden
	@SuppressWarnings("unused")
	private void m1(){
		System.out.println("From parent m1()");
	}
	
	protected void m2(){
		System.out.println("From parent m2()");
	}
}

class Child1 extends Parent1 {
	
	// new m1() method, unique to child class
	@SuppressWarnings("unused")
	private void m1() {
		System.out.println("From child m1()");
	}
	
	// overriding method with more accessibility
	@Override
	public void m2(){
		System.out.println("From child m2()");
	}
}

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent1 obj1 = new Parent1();
		obj1.m2();
		
		Parent1 obj2 = new Child1();
		obj2.m2();
	}
}
