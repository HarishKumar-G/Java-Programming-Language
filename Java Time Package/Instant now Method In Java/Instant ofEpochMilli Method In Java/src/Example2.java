/*
 * Java program to demonstrate Instant.ofEpochMilli() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// get instant using ofEpochMilli() method passed epoch millisecond is 73264271044L
		Instant instant = Instant.ofEpochMilli(73264271044L);
		
		// print result
		System.out.println("Instant: " + instant);
	}
}
