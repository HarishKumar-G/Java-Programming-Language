// Program to convert an Iterable into a collection

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Converting_Iterable_into_Collection_using_Java8_Stream {

	// function to convert Iterable into collection
	public static <T> Collection<T> getCollectionFromIterable(Iterable<T> itr) {

		// create an empty Collection to hold the result
		Collection<T> cltn = new ArrayList<T>();

		return StreamSupport.stream(itr.spliterator(), false).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterable<Integer> i = Arrays.asList(1, 2, 3, 4);
		System.out.println("Iterable List: " + i);

		Collection<Integer> cn = getCollectionFromIterable(i);
		System.out.println("Collection List: " + cn);
	}
}
