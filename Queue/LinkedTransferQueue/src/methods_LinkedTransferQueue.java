/*
 * Java code to illustrate methods of LinkedTransferQueue
 */
import java.util.concurrent.LinkedTransferQueue;
import java.util.*;

public class methods_LinkedTransferQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create object of LinkedTransferQueue
		LinkedTransferQueue<Integer> LTQ = new LinkedTransferQueue<Integer>();

		//Add numbers to end of LinkedTransferQueue using add() method
		LTQ.add(7855642);
		LTQ.add(35658786);
		LTQ.add(5278367);
		LTQ.add(74381793);

		// print the Dequeue
		System.out.println("Linked Transfer Queue: " + LTQ);

		// prints the size of Dequeue after removal using size() method
		System.out.println("Size of linked Transfer Dequeue: " + LTQ.size());

		// removes the front element and prints it using poll() method
		System.out.println("First element: " + LTQ.poll());

		// prints the Dequeue
		System.out.println("Linked Transfer Queue: " + LTQ);

		// prints the size of Dequeue after removal using size() method
		System.out.println("Size of Linked Transfer Queue: " + LTQ.size());

		//Add numbers to end of LinkedTransferQueue using offer() method
		LTQ.offer(20);

		// prints the Dequeue
		System.out.println("Linked Transfer Queue: " + LTQ);

		// prints the size of Dequeue after removal using size() method
		System.out.println("Size of Linked Transfer Queue: " + LTQ.size());

	}
}
