/*
 * Java program to demonstrate Instant.prase() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// get instant using parse method
		Instant instant = Instant.parse("2019-10-01T08:25:24.00Z");
		
		// print result
		System.out.println("Instant: " + instant);
	}
}
