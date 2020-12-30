/* Java program to demonstrate how to implement static and non static class in a Java program */

class OuterClass {
	private static String msg = "GeeksForGeeks";
	private String greetings = " Welcomes You!";
	
	// Only static members of Outer class is directly accessible in nested static class
	public static class NestedStaticClass {
		// Try accessing 'greetings' the non-static variable, there will be a compiler error
		public void printMessage() {
			System.out.println("Message from nested static class: " + msg);
		}
	}
	
	// non-static nested class - also called InnerClass
	public class InnerClass {
		// both static and non-static members of Outer class are accessible in this innerClass
		public void display(){
			System.out.println("Message from non-static nested class: " + msg + greetings);
		}
	}
}

public class Main {

	// How to create instance of static and non static nested class?
	public static void main(String[] args) {
		
		// Creating instance of nested static class
		OuterClass.NestedStaticClass printer =  new OuterClass.NestedStaticClass();
		// call non static method of nested static class
		printer.printMessage();
		
		
		// In order to create instance of innnerClass we need an OuterClass instance
		// Let us create outerClass instance for creating non-static nested class
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		// Calling non static method of innerClass
		inner.display();
		
		
		// One more way for creating instance of InnerClass
		OuterClass.InnerClass innerObject = new OuterClass().new InnerClass();
		innerObject.display();
	}

}
