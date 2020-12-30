/*
 * Java program to demonstrate working of Comparator interface more than one field
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

class Student1
{
	// instance member variables
	String name;
	int Age;
	
	// parameterized constructor
	public Student1(String Name, Integer Age) {
		this.name = Name;
		this.Age = Age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public Integer getAge() {
		return Age;
	}
	
	public void setAge(Integer Age) {
		this.Age = Age;
	}
	
	@Override
	public String toString() {
		return "Customer{" + "Name=" + name + ", Age=" + Age + '}';
	}
	
	static class CustomerSortingComparator implements Comparator<Student1> {
		@Override
		public int compare(Student1 customer1, Student1 customer2) {
			
			// for comparison
			int NameCompare = customer1.getName().compareTo(customer2.getName());
			int AgeCompare = customer1.getAge().compareTo(customer2.getAge());
			
			// 2-level comparison using if-else block
			if (NameCompare == 0) {
				return ((AgeCompare == 0) ? NameCompare : AgeCompare);
			} else {
				return NameCompare;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create ArrayList to store Student1
		List<Student1> al = new ArrayList<>();
		
		// create customer objects using constructor initialization
		Student1 obj1 = new Student1("Ajay", 27);
		Student1 obj2 = new Student1("Sneha", 23);
		Student1 obj3 = new Student1("Simran", 37);
		Student1 obj4 = new Student1("Ajay", 22);
		Student1 obj5 = new Student1("Ajay", 29);
		Student1 obj6 = new Student1("Sneha", 22);

		// add customer objects to ArrayList
		al.add(obj1);
		al.add(obj2);
		al.add(obj3);
		al.add(obj4);
		al.add(obj5);
		al.add(obj6);
		
		// before Sorting arrayList: iterate using Iterator
		Iterator<Student1> custIterator = al.iterator();
		
		System.out.println("Before Sorting:\n");
		while(custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}
		
		// sorting using Collections.sort(a1, comparator);
		Collections.sort(al, new CustomerSortingComparator());
		
		// after Sorting arraylist: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting:\n");
		for (Student1 customer : al) {
			System.out.println(customer);
		}
	}
}
