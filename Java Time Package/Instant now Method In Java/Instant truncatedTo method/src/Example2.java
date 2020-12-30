/*
 * Java program to demonstrate Instant.truncatedTo() method
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example2 {

	public static void main(String[] args) {
		
		// create a Instant object
		Instant instant = Instant.parse("2018-12-30T09:24:54.63Z");
		
		// print instance
		System.out.println("Instant before truncate " + instant);
		
		// truncate to ChronoUnit.DAYS means unit smaller than DAY will be zero
		Instant returnvalue = instant.truncatedTo(ChronoUnit.DAYS);
		
		// print result
		System.out.println("Instant after truncate " + returnvalue);
	}

}
