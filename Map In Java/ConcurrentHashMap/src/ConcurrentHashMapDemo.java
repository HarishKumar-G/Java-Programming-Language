/*
 * Java program to demonstrate working of ConcurrentHashMap
 */

import java.util.concurrent.*;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConcurrentHashMap m = new ConcurrentHashMap();
		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");
		
		// Here we can't add Hello because 101 key is already present in ConcurrentHashMap object
		m.putIfAbsent(101, "Hello");
		
		// we can remove entry because 101 key is already present in ConcurrentHashMap object
		m.remove(101, "Geeks");
		
		// Now we can add Hello
		m.putIfAbsent(103, "Hello");
		
		// we can't replace hello with For
		m.replace(101, "Hello", "For");
		System.out.println(m);
	}
}
