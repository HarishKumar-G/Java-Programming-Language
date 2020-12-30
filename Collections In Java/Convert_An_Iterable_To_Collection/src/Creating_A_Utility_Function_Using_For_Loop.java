/*
 * Below is the program to convert an Iterable into a Collection using for loop
 */

import java.io.*;
import java.util.*;

public class Creating_A_Utility_Function_Using_For_Loop {

	// function to convert Iterable into collection

	public static <T> Collection<T> getCollectionFromIterable(Iterable<T> itr) {
		// create an empty collection to hold the result
		Collection<T> cltn = new ArrayList<T>();

		// Iterate through the iterable to add each element into collection
		for (T t : itr)
			cltn.add(t);

		// return the converted collection
		return cltn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterable<Integer> i = Arrays.asList(1, 2, 3, 4);
		System.out.println("Iterable List: " + i);

		Collection<Integer> cn = getCollectionFromIterable(i);
		System.out.println("Collection List: " + cn);
	}
}
