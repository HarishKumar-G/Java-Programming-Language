/*
 * Java program to demonstrate LinekdBlockingQueue(Collection c) constructor
 */

import java.util.concurrent.LinkedBlockingQueue;
import java.util.*;

public class LinkedBlcokingQueue_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating a collection
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(10);
		v.addElement(2);
		v.addElement(30);
		v.addElement(4);
		v.addElement(50);
		
		// create object of linked blocking queue using LinkedBlockingQueue(Collection c) constructor
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(v);
		
		// print queue
		System.out.println("Linked Blocking Queue: " + lbq);
	}

}
