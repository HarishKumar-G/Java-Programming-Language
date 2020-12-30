/* Use of Super with constructors */
/* SuperClass */
class Boy {
	Boy() {
		System.out.println("Person class constructor");
	}
}

/* subclass Stud extending the Boy class */
class Stud extends Boy {
	Stud() {
		super();
		System.out.println("Student class Constructor");
	}
}

/* Driver program to test */
public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stud s = new Stud();
	}
}
