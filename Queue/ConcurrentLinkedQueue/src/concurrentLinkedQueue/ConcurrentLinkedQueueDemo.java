package concurrentLinkedQueue;

import java.util.concurrent.ConcurrentLinkedQueue;

/*
 * Java program to demonstrate ConcurrentlinkedQueue
 */

public class ConcurrentLinkedQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Create a concurrent Linked Queue using ConcurrentLinkedQueue() constructor
		 */

		ConcurrentLinkedQueue<Integer> clq = new ConcurrentLinkedQueue<Integer>();

		clq.add(12);
		clq.add(70);
		clq.add(1009);
		clq.add(475);


		// display the existing LinkedQueue
		System.out.println("ConcurrentLinkedQueue: " + clq);

		// Create a ConcurrentLinkedQueue using concurrentLinkedQueue(collection c) constructor
		ConcurrentLinkedQueue<Integer> clq1 = new ConcurrentLinkedQueue<Integer>(clq);

		// Displaying the existing LinkedQueue
		System.out.println("Concurrent Linked Queue1: " + clq1);
	}
}
