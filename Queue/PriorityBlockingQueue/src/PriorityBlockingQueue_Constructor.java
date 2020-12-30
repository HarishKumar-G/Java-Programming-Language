/*
 * Java program to demonstrate PriorityBlockingQueue(Collection c) constructor
 */

import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

public class PriorityBlockingQueue_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating a collection
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		v.addElement(5);
		
		// create object of PriorityBlockingQueue using PriorityBlockingQueue(Collection c) constructor
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(v);
		
		// print queue
		System.out.println("Priority Blocking Queue: " + pbq);
	}
}
