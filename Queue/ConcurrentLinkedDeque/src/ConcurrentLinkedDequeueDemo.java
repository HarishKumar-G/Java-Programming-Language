/*
 * Java program to demonstrate concurrent linked dequeue
 */

import java.util.concurrent.*;

public class ConcurrentLinkedDequeueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a concurrent linked deque
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();
		
		cld.addFirst(12);
		cld.addFirst(70);
		cld.addFirst(1009);
		cld.addFirst(475);

		// Displaying the existing linked queue
		System.out.println("ConcurrentLinkedDeque: " + cld);
		
		// Create ConcurrentLinkedDeque using ConcurrentLinkedDeque(Collection c) constructor
		ConcurrentLinkedDeque<Integer> cld1 = new ConcurrentLinkedDeque<Integer>(cld);
		
		// Displaying the existing LinkedQue
		System.out.println("ConcurrentLinkedDeque1: " + cld1);
	}
}