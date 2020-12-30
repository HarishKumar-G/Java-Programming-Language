/*
 * Java program to demonstrate Instant.plus() method
 */

import java.time.*;
import java.time.temporal.*;

public class Example1 {

	public static void main(String[] args) {
		
		// create an Instant object
		Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// add 30 Days to Instant
		Instant value = instant.plus(30, ChronoUnit.DAYS);
		
		// print result
		System.out.println("Instant after adding 30 DAYS " + value);
	}
}
