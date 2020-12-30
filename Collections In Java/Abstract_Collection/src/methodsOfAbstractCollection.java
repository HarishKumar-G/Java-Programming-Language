
//Java code to illustrate the methods of abstraction

import java.util.*;
import java.util.AbstractCollection;

public class methodsOfAbstractCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating an empty collection
		AbstractCollection<String> abs1 = new TreeSet<String>();
		
		// use add() method to add elements into the collection
		abs1.add("Welcome");
		abs1.add("To");
		abs1.add("Geeks");
		abs1.add("4");
		abs1.add("Geeks");
		abs1.add("TreeSet");
		
		// Displaying the Collection
		System.out.println("Abstract Collection 1: "  + abs1);
		
		// Creating another collection
		AbstractCollection<String> abs2 = new TreeSet<String>();
		
		// Displaying the collection
		System.out.println("AbstractCollection 2: " + abs2);
		
		// Using addAll() method to Append
		abs2.addAll(abs1);
		
		// Displaying the collection
		System.out.println("Abstract Collection 2: " + abs2);
		
		// clearing the collection using clear() method
		abs1.clear();
		
		// check for the empty collection
		System.out.println("Is the collection empty? " + abs1.isEmpty());
	}
}
