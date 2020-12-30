/*
 * Java program to demonstate Instant.minus() method
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example1 {

	public static void main(String[] args) {
		
		// Create an Instant object
		Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// subtract 30 days to instant
		Instant value = instant.minus(20, ChronoUnit.DAYS);
		
		// print result
		System.out.println("Instant after subtracting Days: " + value);
	}

}
