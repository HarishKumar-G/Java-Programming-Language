/*
 * Java program to demonstrate Instant.isSupported() method
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// check MILLIS ChronoUnit supported in instant
		boolean value = instant.isSupported(ChronoUnit.MILLIS);
		
		// print result
		System.out.println("ChronoUnit MILLIS is supported: " + value);
	}

}
