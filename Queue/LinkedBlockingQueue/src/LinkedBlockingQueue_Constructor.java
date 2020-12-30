/*
 * Java program to demonstrate LinkedBlockingQueue() constructor
 */
import java.util.concurrent.LinkedBlockingQueue;

public class LinkedBlockingQueue_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Create object of LinkedBlockingQueue using LinkedBlockingQueue() constructor
		 */
		LinkedBlockingQueue<Integer> lbq = new LinkedBlockingQueue<Integer>();
		
		// add numbers
		lbq.add(1);
		lbq.add(2);
		lbq.add(3);
		lbq.add(4);
		lbq.add(5);
		
		// print queue
		System.out.println("LinkedBlockingQueue: " + lbq);
	}
}
