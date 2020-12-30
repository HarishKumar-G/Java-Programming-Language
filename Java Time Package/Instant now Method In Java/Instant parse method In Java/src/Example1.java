/*
 * Java program to demonstrate Instant.parse() method
 */

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		
		// get instant using prase method
		Instant instant = Instant.parse("2018-11-30T18:35:24.00Z");
		
		//print result
		System.out.println("Instant: " + instant);
	}
}
