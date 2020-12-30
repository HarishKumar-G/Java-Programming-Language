/*
 * Java program to demonstrate insertion in TreeSet
 */

import java.util.*;

public class Insertion_Into_A_TreeSet {
	
	public static void main(String[] args) {
		TreeSet<String> ts1 = new TreeSet<String>();
		
		// elements are added using add() method
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("D");
		
		// Duplicates will not get insert
		ts1.add("C");
		
		// elements get stored in default natural Sorting Order(Ascending)
		System.out.println(ts1);
	}
}
