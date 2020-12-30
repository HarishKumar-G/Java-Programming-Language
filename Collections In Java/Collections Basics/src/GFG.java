/*
 * Java program to show why collection framework was needed
 */

import java.io.*;
import java.util.*;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating instances of array, vector and hash table
		int arr[] = new int[] {1, 2, 3, 4};
		
		Vector<Integer> v = new Vector();
		Hashtable<Integer, String> h = new Hashtable();
		
		v.addElement(1);
		v.addElement(2);
		h.put(1, "geeks");
		h.put(2, "4geeks");
		
		/*
		 * Array instance creation requires [], while Vector and hash table require ()
		 * Vector element insertion require ()
		 * Vector element insertion requires addElement(), but hash table element insertion requires put()
		 */
		
		// Accessing first element of array, vector and hashtable
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));
		
		// Array elements are accessed using [], vector elements using elementAt() and 
		// hashtable elements using get()
	} 
}
