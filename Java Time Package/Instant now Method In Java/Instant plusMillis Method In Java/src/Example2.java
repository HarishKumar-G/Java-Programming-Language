/*
 * Java program to demonstrate Instant.plusMillis() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant instant = Instant.now();
		
		// current Instant
		System.out.println("Current instant: " + instant);
		
		// addition of 420000 MILLI_OF_SECOND means 420 seconds to this instant
		Instant returnedValue = instant.plusMillis(420000);
		
		// print result
		System.out.println("Returned Instant: " + returnedValue);
	}
}
