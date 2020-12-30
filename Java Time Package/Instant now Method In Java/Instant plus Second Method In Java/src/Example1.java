/*
 * Java program to demonstrate Instant.plusSeconds() method
 */

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		
		// create a instant object
		Instant instant = Instant.parse("2018-10-28T19:34:50.63Z");
		
		// print Instant
		System.out.println("Instant: " + instant);
		
		// addition of 84000 seconds to this instant
		Instant returnedValue = instant.plusSeconds(84000);
		
		// print result
		System.out.println("Returned Instant: " + returnedValue);
	}
}
