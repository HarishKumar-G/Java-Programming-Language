import java.util.*;
import java.lang.*;
import java.io.*;

class Student {
		int rollno;
		String name, address;
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student> {
		public int compare(Student a, Student b) {
			return a.rollno - b.rollno;
		}
}

class Working_Of_Comparator_Interface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student[] ary = { new Student(111, "bbbb", "london"),
							new Student(131, "aaaa", "nyc"),
							new Student(121, "cccc", "jaipur") };

		System.out.println("Unsorted: ");
		for(int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}

		Arrays.sort(ary, 0, 2, new Sortbyroll());
		System.out.println("\nSorted by rollno: ");
		for(int i = 0; i < ary.length; i++)
			System.out.println(ary[i]);
	}
}
