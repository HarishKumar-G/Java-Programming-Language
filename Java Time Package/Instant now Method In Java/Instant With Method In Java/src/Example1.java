/*
 * Java program to demonstrate Instant.with() method
 */

import java.time.*;
import java.time.temporal.*;

public class Example1 {

	public static void main(String[] args) {
		
		// create an instant Object
		Instant local = Instant.parse("2018-12-30T19:34:50.63Z");
		
		// print instance
		System.out.println("Instant before adjustment: " + local);
		
		// apply with method of Instance class
		Instant updatedlocal = local.with(Instant.EPOCH);
		
		// print instance
		System.out.println("Instant after adjustment: " + updatedlocal);
		
	}

}
