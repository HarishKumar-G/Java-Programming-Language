/*
 * Java program to illustrate AbstractSet Class
 */

import java.util.*;

public class AbstractSetClassDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			// creating object AbstractSet<Integer>
			AbstractSet<Integer> abs_set = new TreeSet<Integer>();
			
			// populating abs_set
			abs_set.add(1);
			abs_set.add(2);
			abs_set.add(3);
			abs_set.add(4);
			abs_set.add(5);
			
			// print abs_set
			System.out.println("AbstractSet: " + abs_set);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
