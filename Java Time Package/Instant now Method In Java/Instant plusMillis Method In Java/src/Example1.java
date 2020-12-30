/*
 * Java program to demonstrate Instant.plusMillis() method
 */

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		
		// create a Instant Object
		Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// addition of 8800000 MILLI_OF_SECOND means 8800 seconds to this instant
		Instant returnedValue = instant.plusMillis(8800000);
	
		// print result
		System.out.println("Returned Instant: " + returnedValue);
	}
}
