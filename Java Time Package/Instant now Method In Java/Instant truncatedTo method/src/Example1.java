/*
 * Java program to demonstrate Instant.truncatedTo() method
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example1 {

	public static void main(String[] args) {
		// create a Instant object
		Instant instant = Instant.parse("2018-12-30T09:24:54.63Z");
		
		// print instance
		System.out.println("Instance before truncate " + instant);
		
		// truncate to ChronoUnit.HOURS means unit smaller than Hour will be zero
		Instant returnvalue = instant.truncatedTo(ChronoUnit.HOURS);
		
		// print result
		System.out.println("Instant after truncate " + returnvalue);
	}

}
