/*
 * Java code to illustrate the methods of LinkedBlockingDeque
 */
import java.util.concurrent.LinkedBlockingDeque;
import java.util.*;

public class methods_Of_LinkedBlockingDeque {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Create objects of linked Blocking Queue
		LinkedBlockingDeque<Integer> LBD = new LinkedBlockingDeque<Integer>();
		
		// Add numbers to end of LinkedBlockingDeque using add() method
		LBD.add(7855642);
		LBD.add(35658786);
		LBD.add(5378367);
		LBD.add(74381793);
		
		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);
		
		// prints the size of Deque after the removal using size() method
		System.out.println("Size of linked blocking deque: " + LBD.size());
		
		// removes the front element and prints it using removeFirst() method
		System.out.println("First element:  " + LBD.removeFirst());
		
		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);
		
		// prints the size of Deque after the removal using size() method
		System.out.println("Size of linked Blocking Deque: " + LBD.size());
		
		// Add numbers to the end of LinkedBlockingDeque using offer() method
		LBD.offer(20);
		
		// prints the Deque
		System.out.println("Linked Blocking Deque: " + LBD);
		
		// prints the size of Deque after removal using size() method
		System.out.println("Size of linked blocking Deque: " + LBD.size());
	}
}
