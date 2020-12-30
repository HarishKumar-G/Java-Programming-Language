/*
 * Java program to demonstrate Instant.ofEpochMilli() method
 */

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		
		// create a long variable for milliseconds
		long milliseconds = 999999000;
		
		// get Instant using ofEpochMilli() method
		Instant instant = Instant.ofEpochMilli(milliseconds);
		
		// print result
		System.out.println("Instant: " + instant);
	}
}
