package concurrentLinkedQueue;

/*
 * Java code to illustrate methods of ConcurrentLinkedQueue
 */

import java.util.concurrent.*;

public class methods_Of_ConcurrentLinkedQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a ConcurrentLinkedQueue using ConcurrentLinkedQueue() constructor
		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();
		
		clq.add(12);
		clq.add(70);
		clq.add(1009);
		clq.add(475);
		
		// display the existing LinkedQueue
		System.out.println("Concurrent Linked Queue: " + clq);
		
		// Displaying the first element using peek() method
		System.out.println("First element is: " + clq.peek());
		
		// Remove and display the first element using poll() method
		System.out.println("Head element is: " + clq.poll());
		
		// Displaying the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);
		
		// Get the size using size() method
		System.out.println("Size =  " + clq.size());
	}
}
