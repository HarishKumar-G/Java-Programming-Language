/*
 * Java program to demonstrate Instant.with() method
 */

import java.time.*;
import java.time.temporal.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create an Instant Object
		Instant local = Instant.parse("2021-01-01T19:55:30Z");
		
		// print distance
		System.out.println("Instance before applying method: " + local);
		
		// apply with method of Instant class
		Instant updatedlocal = local.with(ChronoField.INSTANT_SECONDS, 450000000);
		
		// print instance
		System.out.println("Instant after applying method: " + updatedlocal);
	}

}
