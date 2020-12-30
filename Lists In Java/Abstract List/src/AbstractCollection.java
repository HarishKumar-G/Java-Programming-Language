/*
 * Java code to illustrate methods of AbstractCollection
 */

import java.util.*;

public class AbstractCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an empty AbstractList
		AbstractList<String> list = new LinkedList<String>();
		
		// Using add() method to add elements in the list
		list.add("Geeks");
		list.add("for");
		list.add("Geeks");
		list.add("10");
		list.add("20");
		
		// Output the list
		System.out.println("Abstract List: " + list);
		
		// Remove the head using remove()
		list.remove(3);
		
		// print the final list
		System.out.println("Final AbstractList: " + list);
		
		// getting the index of last occurence using lastIndexOf() method
		int lastIndex = list.lastIndexOf("A");
		
		// printing the index
		System.out.println("Last index of A: " + lastIndex);
	}
}
