/* A java program to demonstrate use of static keyword with methods and variables */

class Student{
	
	String name;
	int rollno;

	static String clgName;
	static int counter = 0;

	public Student(String name) {
		this.name = name;
		this.rollno = setRollNo();
	}

	// getting unique rollNo through static variable(counter)
	static int setRollNo() {
		counter++;
		return counter;
	}

	static void setClg(String name) {
		clgName = name;
	}

	// instance method
	void getStudentInfo() {
		System.out.println("name: " + this.name);
		System.out.println("rollNo: " + this.rollno);
		// accessing static variable
		System.out.println("clgName: " + clgName);
	}
}

public class Example5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.setClg("XYZ");
		
		Student s1 = new Student("Alice");
		Student s2 = new Student("Bob");
		
		s1.getStudentInfo();
		s2.getStudentInfo();
	}
}
