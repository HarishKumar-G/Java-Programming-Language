/*
 * Java Code to illustrate methods of AbstractSequentialList
 */

import java.util.*;
import java.util.AbstractSequentialList;

public class methods_Of_AbstractSequentialList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an empty AbstractSequentialList
		AbstractSequentialList<String> absqlist = new LinkedList<String>();
		
		// Using add() method to add elements in the list
		absqlist.add("Geeks");
		absqlist.add("for");
		absqlist.add("Geeks");
		absqlist.add("10");
		absqlist.add("20");
		
		// output of the list
		System.out.println("AbstractSequentialList: " + absqlist);
		
		// Remove the final list
		absqlist.remove(3);
		
		// Print the final list
		System.out.println("Final list: " + absqlist);
		
		// fetching the specific element from the list using get() method
		System.out.println("The element is: " + absqlist.get(2));
	}
}
