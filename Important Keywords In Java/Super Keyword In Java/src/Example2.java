class Person {
	void message() {
		System.out.println("This is person class");
	}
}

class Student extends Person {
	void message() {
		System.out.println("This is student class");
	}
	
	void display() {
		message();
		super.message();
	}
}

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.display();
	}
}
