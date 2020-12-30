/*
 * Java program to demonstrate Instant.until() method
 */

import java.time.*;
import java.time.temporal.*;

public class Example1 {

	public static void main(String[] args) {
		
		// create Instant objects
		Instant instant1 = Instant.parse("2019-01-03T19:35:50.00Z");
		Instant instant2 = Instant.parse("2019-01-04T13:18:59:00Z");
	
		// apply until method of Instant class
		long result = instant1.until(instant2, ChronoUnit.MINUTES);
		
		// print results
		System.out.println("Result in Minutes: " + result);
	}
}
