/*
 * Java code to show that UnsupportedOperationException will be thrown when ImmuatbleList is modified
 */

import java.util.*;

public class Unsupported_Modified_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// empty imutable map
		List<String> list = List.of();
		
		// Lets try adding element in List
		List.add("Geeks");
	}

}
