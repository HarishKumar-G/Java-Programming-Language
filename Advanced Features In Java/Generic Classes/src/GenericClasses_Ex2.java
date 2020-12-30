/*
 * A simple Java program to show multiple type parameters in Java Generics
 */

// We use < > to specify Parameter type
class Test1<T, U>
{
	T obj1;		// An object of type T
	U obj2;		// An object of type U
	
	// constructor
	Test1(T obj1, U obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	
	// To print objects of T and U
	public void print() {
		System.out.println(obj1);
		System.out.println(obj2);
	}
}

public class GenericClasses_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test1<String, Integer> obj = new Test1<String, Integer>("GFG", 15);
		
		obj.print();
	}
}
