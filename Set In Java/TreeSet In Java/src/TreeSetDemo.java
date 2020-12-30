/*
 * JavaCode to illustrate StringBuffer class does not implements comparable interface
 */

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>();
			
			// elements are added using add() method
			ts.add(new StringBuffer("A"));
			ts.add(new StringBuffer("Z"));
			ts.add(new StringBuffer("L"));
			ts.add(new StringBuffer("B"));
			ts.add(new StringBuffer("O"));
			
			// we will get RuntimeException :ClassCastException as StringBuffer does not 
			// implement comparable interface
			System.out.println(ts);
	}
}
