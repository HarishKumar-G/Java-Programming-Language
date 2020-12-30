/*
 * Java program to demonstrate HashSet In Java
 */
import java.util.*;


public class HashSet_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h = new HashSet<String>();
		
		// Adding elements to HashSet using add() method
		h.add("India");
		h.add("Australia");
		h.add("Canada");
		h.add("Japan");
		
		// Displaying the HashSet
		System.out.println(h);
		System.out.println("List contains India or not:" + h.contains("India"));
		
		// Removing items from HashSet using remove()
		h.remove("Australia");
		System.out.println("List after removing Australia: " + h);
		
		// Iterating over HashSet items
		System.out.println("Iterating over list: ");
		Iterator<String> i = h.iterator();
		while(i.hasNext())
			System.out.println(i.next());
	}
}
