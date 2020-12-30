/*
 * Java program to demonstrate Instant.plusSeconds() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant instant = Instant.now();
		
		// current Instant
		System.out.println("Current instant: " + instant);
		
		// addition of 930000 seconds to this instant
		Instant returnedValue = instant.plusSeconds(930000);
		
		// print result
		System.out.println("Returned Instant: " + returnedValue);
	}
}
