/*
 * Java program to demonstrate Instant.range() method
 */

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant instant = Instant.parse("2018-10-28T19:34:50.63Z");
		
		// print Instant
		System.out.println("Instant: " + instant);
		
		// get range of NANO_OF_SECOND field from instant using range method
		ValueRange range = instant.range(ChronoField.NANO_OF_SECOND);
		
		// print range of NANO_OF_SECOND
		System.out.println("Range of NANO_OF_SECOND: " + range);
	}

}
