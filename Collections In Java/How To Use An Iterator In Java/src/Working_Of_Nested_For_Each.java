/*
 * Below is the JAVA program to demonstrate the working of nested for-each
 */

import java.util.*;

public class Working_Of_Nested_For_Each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a linked list which stores integer elements
		List<Integer> l = new LinkedList<Integer>();
		
		// now add elements to the link list
		l.add(2);
		l.add(3);
		l.add(4);
		
		// make another link list which stores integer elements
		List<Integer> s = new LinkedList<Integer>();
		s.add(2);
		s.add(4);
		s.add(5);
		s.add(6);
		
		// Iterator to iterate over a link list
		for (int a:l) {
			for (int b:s) {
				if (a < b) {
					System.out.print(a + " ");
				}
			} 
		}
	}
}
