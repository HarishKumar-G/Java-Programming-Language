/*
 * Java Program to demonstrate iterator references
 */

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iterator_References {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v = new Vector();
		
		// create three iterators
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator Itr = v.listIterator();
		
		// Print class names of iterators
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(Itr.getClass().getName());
	}
}
