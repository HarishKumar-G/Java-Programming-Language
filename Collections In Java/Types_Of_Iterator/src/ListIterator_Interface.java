/*
 * JAVA program to demonstrate working of ListIterator
 */

import java.util.*;

public class ListIterator_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// take a vector to store integer objects
		Vector<Integer> v = new Vector<Integer>();
		
		//Adding elements to Vector
		v.add(10);
		v.add(20);
		v.add(30);
		
		// creating a ListIterator
		ListIterator lit = v.listIterator();
		System.out.println("In Forward direction: ");
		
		while(lit.hasNext())
			System.out.print(lit.next() + " ");
		
		System.out.print("\n\nIn backward direction:\n");
		
		while(lit.hasPrevious())
			System.out.print(lit.previous() + " ");
	}
}
