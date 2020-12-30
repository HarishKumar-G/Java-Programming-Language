/*
 * Java program to demonstrate Instant.plus() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant inst = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// add 20 Days to instant
		Instant value = inst.plus(Period.ofDays(10));
		
		// print result
		System.out.println("Instant after adding Days: " + value);
	}
}
