/*
 * Java program to demonstrate Instant.minus() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create an Instant object
		Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// subtract 10 days to instant
		Instant value = instant.minus(Period.ofDays(10));
		
		// print result
		System.out.println("Instant after subtracting Days: " + value);
	}

}
