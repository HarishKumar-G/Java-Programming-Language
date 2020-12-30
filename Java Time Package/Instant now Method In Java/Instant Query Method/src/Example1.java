/*
 * Java program to demonstrate Instant.query() method
 */

import java.time.*;
import java.time.temporal.*;

public class Example1 {

	public static void main(String[] args) {
		
		// Create Instant Object
		Instant instant = Instant.parse("2018-12-31T10:15:30.00Z");
		
		// apply query method of instant class
		String value = instant.query(TemporalQueries.precision()).toString();
		
		// print the result
		System.out.println("Precision value for Instant is " + value);
	}

}
