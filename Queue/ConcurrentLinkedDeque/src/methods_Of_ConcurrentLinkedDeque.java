/*
 * Java code to illustrate the methods of ConcurrentLinkedDeque
 */
import java.util.concurrent.*;

public class methods_Of_ConcurrentLinkedDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a concurrentLinkedDeque using a concurrentLinkedDeque() constructor
		ConcurrentLinkedDeque<Integer> cld = new ConcurrentLinkedDeque<Integer>();
		
		cld.addFirst(10);
		cld.addFirst(15);
		cld.addFirst(25);
		cld.addFirst(40);
		
		// Displaying the existing linked Deque
		System.out.println("ConcurrentLinkedDeque: " + cld);
		
		// Displaying the last element using getLast() method
		System.out.println("The last element is: " + cld.getLast());
		
		// Displaying the first element using peekFfirst() method
		System.out.println("First element is: " + cld.peekFirst());
		
		// Remove the Last element using removeLast() method
		cld.removeLast();
		
		// Remove the first element using removeFirst() method
		cld.removeFirst();
		
		// Display the existing LinkedDeque
		System.out.println("ConcurrentLinkedDeque: " + cld);
	}
}
