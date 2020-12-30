/*
 * Java program to demonstrate ConcurrentSkipListSet
 */

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// initializing the set using ConcurrentSkipListSet()
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();
		
		// adding elements to this set using add method
		set.add(8);
		set.add(78);
		set.add(64);
		set.add(12);
		set.add(45);
		
		//Printing the concurrent skip list set
		System.out.println("ConcurrentSkipListSet: " + set);
		
		// Printing the highest element of the set using last() method
		System.out.println("The highest element of the set: " + set.last());
		
		// Retrieving and removing the first element of the set
		System.out.println("The first element of the set: " + set.pollFirst());
		
		// Checks if 9 is present in the set using contains() method
		if (set.contains(9))
			System.out.println("9 is present in the set.");
		else
			System.out.println("9 is not present in the set.");
		
		// Printing the size of the set using size() method
		System.out.println("Number of elements in the set = " + set.size());
	}
}
