/*
 * Java program to demonstrate Instant.query() method
 */

import java.time.*;
import java.time.temporal.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create Instant Object
		Instant instant = Instant.parse("2018-12-31T10:15:30:00Z");
		
		// apply query method of Instant class print the result
		System.out.println("Zone value for Instant is: " + instant.query(TemporalQueries.offset()));
	}
}
