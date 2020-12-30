/*
 * JAVA program to demonstrate the need for Anonymous Inner Class
 */

interface Age {
	int x = 21;
	void getAge();
}

class MyClass implements Age {
	@Override
	public void getAge() {
		// print the Age
		System.out.println("Age is " + x);
	}
}

// MyClass implement the methods of Age Interface
public class Anonymous_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// MyClass is implementation class of Age interface
		MyClass obj = new MyClass();
		
		// calling getAge() method implemented at MyClass
		obj.getAge();
	}
}
