/*
 * Java program to demonstrate Instant.toString() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant instant = Instant.parse("2022-06-21T19:34:50.63Z");
		
		// print Instant using toString()
		System.out.println("Instant: " + instant);
	}
}
