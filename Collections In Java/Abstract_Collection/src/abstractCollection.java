
/* Java code to illustrate AbstractCollection */

import java.util.*;
import java.util.AbstractCollection;

public class abstractCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an empty collection 
		AbstractCollection<Object> abs = new ArrayList<Object>();
		
		// Use add method to add elements to add elements in the collection
		abs.add("Welcome");
		abs.add("To");
		abs.add("Geeks");
		abs.add("4");
		abs.add("Geeks");
		
		// Displaying the Collection
		System.out.println("Abstract Collection : " + abs);
	}
}
