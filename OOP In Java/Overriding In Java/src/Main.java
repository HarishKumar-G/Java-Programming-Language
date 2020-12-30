/* A Simple Java program to demonstrate method overriding in Java */

// Base class
class Parent {
	void show(){
		System.out.println("Parent's show()");
	}
}

// Inherited class
class Child extends Parent {
	@Override
	void show(){
		System.out.println("Child's show()");
	}
}

// Driver class
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent obj1 = new Parent();
		obj1.show();
		
		Child obj2 = new Child();
		obj2.show();
	}
}
