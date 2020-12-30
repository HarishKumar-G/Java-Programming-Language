/*
 * Java program to demonstrate Instant.range() method
 */

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class Example3 {

	public static void main(String[] args) {
		
		// create a Instant Object
		Instant instant = Instant.parse("2018-10-28T19:34:50.63Z");
		
		// try to find range of era using ChronoField
		try {
			ValueRange secondvalue = instant.range(ChronoField.ERA);
		} catch(Exception e) {
				// print exception
			System.out.println("Exception: " + e);
		}
	}
}
