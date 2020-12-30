/*
 * Using Generics converts run-time exceptions into compile time exception
 */

import java.util.*;

public class Generic_Functions_Ex3 {

	public static void main(String[] args) {
		
		// creating an ArrayList with type String specified
		ArrayList<String> al = new ArrayList<String>();
		al.add("Sachin");
		al.add("Rahul");
		
		// Now compiler doesn't allow this
		al.add(10);
		
		String s1 = (String)al.get(0);
		String s2 = (String)al.get(1);
		String s3 = (String)al.get(2);
	}
}