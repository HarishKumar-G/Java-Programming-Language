/*
 * Java code to illustrate of() method to create ImmutableSet
 */

import java.util.*;
import java.google.common.collect.ImmutableMap;

public class ImmutableMap_Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// non-empty immuatble set
		Map<Integer, String> map = Map.of(1, "Geeks ",
										  2, "for",
										  3, "Geeks");
		
		// let's print the set
		System.out.println(map);
	}
}
