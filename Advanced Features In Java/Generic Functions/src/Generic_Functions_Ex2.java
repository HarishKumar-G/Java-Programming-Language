/*
 * A Simple Java program to demonstrate that NOT using Generics can cause RunTime exceptions
 */

import java.util.*;

public class Generic_Functions_Ex2 {

	public static void main(String[] args) {
		
		// creating an ArrayList without anytype specified
		ArrayList al = new ArrayList();
		al.add("Sachin");
		al.add("Rahul");
		al.add(10);		// compiler allows this
		
		String s1 = (String)al.get(0);
		String s2 = (String)al.get(1);
		
		// cause Runtime Exceptions
		String s3 = (String)al.get(2);
	}
}
