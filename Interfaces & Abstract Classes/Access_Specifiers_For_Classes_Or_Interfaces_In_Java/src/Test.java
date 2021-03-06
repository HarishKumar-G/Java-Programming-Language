/*
 * In Java methods and data members of a class/interface can have one of the following four access 
 * specifiers. The access specifiers are listed according to their restrictiveness order.
 * 
 * 1. private
 * 2. default (when no access specifier is specified)
 * 3. protected
 * 4 public
 * 
 * 
 * But, the classes and interfaces themselves can have only two access specifiers when declared outside
 * any other class
 * 
 * 1. public 
 * 2. default (when no access specifier is specified)
 * 
 * 
 * We cannot declare class/interface with private or protected access specifiers. For example, following 
 * program fails in compilation.
 * 
 */

protected class bucky {};

public class Test {
	public static void main(String args[]) {
		
	}
}

/* Nested interfaces and classes can have all access specifiers */

