/*
 * Java program to demonstrate that annotations are 
 * not barely comments (This program throws compiler 
 * error because we have mentioned override. 
 * but not overriden. we have overloaded display)
 */

class Base
{
	public void display() {
		System.out.println("Base display()");
	}
}

public class Annotation_Example extends Base {

	@Override
	public void display(int a) {
		System.out.println("Derived displaay(int )");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annotation_Example obj = new Annotation_Example();
		obj.display();
	}
}
