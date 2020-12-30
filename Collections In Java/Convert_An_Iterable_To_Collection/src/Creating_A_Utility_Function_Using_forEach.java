/*
 * Below is the program to convert an Iterable into a collection using iterable.forEach
 */
import java.io.*;
import java.util.*;

public class Creating_A_Utility_Function_Using_forEach {

	public static <T> Collection<T> getCollectionFromIterable(Iterable<T> itr) {
		// create an empty collection to hold the result
		Collection<T> cltn = new ArrayList<T>();
		
		// use iterable.forEach() to Iterate through the iterable and add each element into the collection
		
		itr.forEach(cltn::add);
		
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
