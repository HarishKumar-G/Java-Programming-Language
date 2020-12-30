/*
 * Below is the Java program to create ImmutableList
 */

import com.google.common.collect.*;
import java.util.*;

public class Immutable_List {

	// Function to create Immutable from list
	public static <T> void iList(List<T> list) {
		// Create ImmuatableMap from Map using copyOf()
		ImmutableList<T> immutableList = ImmutableList.copyOf(list);
		
		// Print the ImmutableMap
		System.out.println(immutableList);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>(Arrays.asList("Geeks", "For", "Geeks"));
		iList(list);
	}
}
