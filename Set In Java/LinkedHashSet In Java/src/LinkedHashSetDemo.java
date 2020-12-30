/*
 * Below is the example program to illustrate linkedHashSet in Java
 */

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		
		// Adding element to LinkedHashSet
		linkedSet.add("A");
		linkedSet.add("B");
		linkedSet.add("C");
		linkedSet.add("D");
		
		// This will not add new elements as A already exists
		linkedSet.add("A");
		linkedSet.add("E");
		
		System.out.println("Size of linkedHashSet = " + linkedSet.size());
		System.out.println("Original linkedHashSet: " + linkedSet);
		System.out.println("Removing D from linkedHashSet: " + linkedSet.remove("D"));
		System.out.println("Trying to remove Z which is not " + "present: " + linkedSet.remove("Z"));
		System.out.println("Checking if A is present: " + linkedSet.contains("A"));
		System.out.println("Updated linkedHashSet: " + linkedSet);
	}
}
