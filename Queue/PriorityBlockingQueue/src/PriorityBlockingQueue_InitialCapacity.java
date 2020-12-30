/*
 * Java program to demonstrate PriorityBlockingQueue(int initialCapacity) constructor
 */

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueue_InitialCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// define capacity of PriorityBlockingQueue
		int capacity = 15;
		
		// create object of PriorityBlockingQueue using PriorityBlockingQueue(int initialCapacity) constructor
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(capacity);
		
		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		pbq.add(4);
		pbq.add(5);
		
		// print queue
		System.out.println("PriorityBlockingQueue: " + pbq);
	}
}
