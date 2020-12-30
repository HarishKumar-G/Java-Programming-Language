/*
 * Java program to demonstrate concurrent skip list set
 */
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//initializing the set using ConcurrentSkipListSet
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();
		
		// adding elements to this set
		set.add(78);
		set.add(64);
		set.add(12);
		set.add(45);
		set.add(8);
		
		// printing the concurrent skip list set
		System.out.println("ConcurrentSkipListSet: " + set);
		
		// initializing the set using ConcurrentSkipListSet(Collection)
		ConcurrentSkipListSet<Integer> set1 = new ConcurrentSkipListSet<Integer>(set);
		
		// Printing the concurrentSkipListSet1
		System.out.println("ConcurrentSkipListSet1: " + set1);
	}
}
