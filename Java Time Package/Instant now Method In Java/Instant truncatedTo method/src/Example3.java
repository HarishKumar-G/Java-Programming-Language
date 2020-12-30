/*
 * Java program to demonstrate Instant.tuncatedTo() Method In Java
 */

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Example3 {

	public static void main(String[] args) {
		
		// create a Instant Object
		Instant instant = Instant.parse("2018-12-30T09:24:54.63Z");
		
		try {
			instant.truncatedTo(ChronoUnit.ERAS);
		} catch(Exception e) {
				System.out.println("Exception: " + e);
		}
	}
}
