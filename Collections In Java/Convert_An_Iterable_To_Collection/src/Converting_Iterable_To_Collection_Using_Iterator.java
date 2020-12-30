/*
 * Below is the program to convert an Iterable into a collection using Iterator
 */

// The forEach loop uses Iterator in the background. Hence it can be done explicitly in the following way.

import java.io.*;
import java.util.*;

public class Converting_Iterable_To_Collection_Using_Iterator {

	// function to convert Iterable into Collection 
	public static <T> Collection<T> getCollectionFromIterable(Iterable<T> itr) {
		
		// Create an empty collection to hold the result
		Collection<T> cltn = new ArrayList<T>();
		
		// Get the iterator at the iterable
		Iterator<T> iterator = itr.iterator();
		
		//Iterate through the iterable using iterator to add each element into the collection
		while(iterator.hasNext()) {
			cltn.add(iterator.next());
		}
		
		// Return the converted collection
		return cltn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Iterable<Integer> i = Arrays.asList(1, 2, 3, 4);
		System.out.println("Iterable List: " + i);

		Collection<Integer> cn = getCollectionFromIterable(i);
		System.out.println("Collection list: " + cn);
	}
}
