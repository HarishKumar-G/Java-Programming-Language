import java.util.ArrayList;
import java.util.List;

/* Java program to illustrate the concept of Aggregation */

class Student{
	String name;
	int id;
	String dept;
	
	Student(String name, int id, String dept){
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Department {
	String name;
	private List<Student> students;
	
	public Department(String name, List<Student> students) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.students = students;
	}
	
	public List<Student> getStudents(){
		return students;
	}
}

class Institute {
	String instituteName;
	private List<Department> departments;
	
	Institute(String name, List<Department> departments){
		this.instituteName = name;
		this.departments = departments;
	}
	
	public int getTotalStudentsInInstitute(){
		int noOfStudents = 0;
		List<Student> students;
		
		for(Department dept : departments) {
			students = dept.getStudents();
			for(@SuppressWarnings("unused") Student s : students){
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}

public class Aggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Mia", 1, "CS");
		Student s2 = new Student("Priya", 2, "CS");
		Student s3 = new Student("John", 1, "EC");
		Student s4 = new Student("Rahul", 2, "EC");
		Student s5 = new Student("Kuldeep", 3, "CS");
		//Student s6 = new Student("Praveen", 3, "EC");
		
		// making a list of CS students
		List <Student> cs_students = new ArrayList<Student>();
		cs_students.add(s1);
		cs_students.add(s2);
		cs_students.add(s5);
		
		// making a list of EC students
		List <Student> ec_students = new ArrayList<Student>();
		ec_students.add(s3);
		ec_students.add(s4);
	//	ec_students.add(s6);
		
		Department CS = new Department("CS", cs_students);
		Department EC = new Department("EC", ec_students);
		
		List <Department> departments = new ArrayList<Department>();
		departments.add(CS);
		departments.add(EC);
		
		// Creating an instance of institute.
		Institute institute = new Institute("BLAW", departments);
		
		System.out.print("Total students in institute: ");
		System.out.print(institute.getTotalStudentsInInstitute());
	}
}
