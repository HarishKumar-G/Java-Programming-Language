/*
 * Java program to demonstrate Instant.isSupported() method
 */

import java.time.*;
import java.time.temporal.ChronoField;

public class Example1 {
	public static void main(String args[]) {
			// create a Insant object
			Instant instant = Instant.parse("2018-12-30T19:34:50.63Z");
			
			// check Milli of Second value from instant
			boolean value = instant.isSupported(ChronoField.MILLI_OF_SECOND);
			
			// print result
			System.out.println("MiliSecond Field is supported: " + value);
			
	}
}
