/*
 * Below is the Java program to create ImmuatbleList
 */

import com.google.common.collect.ImmutableList;
import java.util.*;

public class Immutable_List_using_Of_function {

	// Function to create ImmutableList
	public static void iList() {
		// Create ImmutableList using of()
		ImmuatableList<String> immutableList = ImmutableList.of("Geeks", "For", "Geeks");
		
		// Print the ImmutableMap
		System.out.println(immutableList);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iList();
	}
}
