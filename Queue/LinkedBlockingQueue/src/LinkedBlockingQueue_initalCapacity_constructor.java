/*
 * Java program to demonstrate LinkedBlockingQueue(int initialCapacity) constructor
 */
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_initalCapacity_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// define capacity of LinkedBlockingQueue
		int capacity = 15;
		
		//create object of LinkedBlockingQueue using LinkedBlockingQueue(int initialCapacity) constructor
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>(capacity);
		
		// add numbers
		lbq.add(1);
		lbq.add(2);
		lbq.add(3);
		
		// print queue
		System.out.println("LinkedBlockingQueue: " + lbq);
	}
}
