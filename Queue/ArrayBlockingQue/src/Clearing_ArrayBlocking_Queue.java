import java.util.concurrent.ArrayBlockingQueue;

/*
 *  Clearing the array Blocking Queue
 */

public class Clearing_ArrayBlocking_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// defining capacity of ArrayBlockingQueue
		int capacity = 15;
		
		// create object of ArrayBlockingQueue
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
		
		// add numbers
		abq.add(1);
		abq.add(2);
		abq.add(3);
		
		// print queue
		System.out.println("ArrayBlockingQueue: " + abq);
		
		// remove all the elements
		abq.clear();
		
		// print queue
		System.out.println("Array Blocking Queue: " + abq);
	}
}
