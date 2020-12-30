/*
 * Java program to demonstrate PriorityBlockingQueue(int initialCapacity, Comparator comparator) constructor
 */
import java.util.concurrent.PriorityBlockingQueue;
import java.util.*;

public class Priority_Blocking_Queue_initialCapacity_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// define capacity of PriorityBlockingQueue
		int capacity = 15;
		
		// create object of PriorityBlockingQueue
		PriorityBlockingQueue<Integer> pbq = new PriorityBlockingQueue<Integer>(capacity, Comparator.reverseOrder());
		
		// add numbers
		pbq.add(1);
		pbq.add(2);
		pbq.add(3);
		pbq.add(4);
		
		// print queue
		System.out.println("Priority Blocking Queue: " + pbq);
	}
}
