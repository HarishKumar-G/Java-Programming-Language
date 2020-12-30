/*
 * Java program to illustrate Cloneable Interface
 */

import java.lang.Cloneable;

/*
 * By implementing Cloneable interface we make sure that instances of class A
 */

class A implements Cloneable
{
	int i;
	String s;
	
	public A(int i, String s) {
		this.i = i;
		this.s = s;
	}
	
	/*
	 * Overriding clone() method by simply calling object class clone() method
	 */
	@Override
	protected Object clone()  throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Clonable_Interface {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		A a = new A(20, "GeeksForGeeks");
		
		/*
		 * cloning 'a' and holding new cloned object reference in b
		 */
		
		// down-casting as clone() return type is object
		A b = (A)a.clone();
		
		System.out.println(b.i);
		System.out.println(b.s);
	}
}
