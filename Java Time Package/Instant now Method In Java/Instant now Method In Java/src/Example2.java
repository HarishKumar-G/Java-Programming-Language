/*
 * Java program to demonstrate Instant.now() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		// create a clock
		Clock c1 = Clock.systemUTC();
		
		// create an Instant object using now(CLock)
		Instant It = Instant.now(c1);
		
		// print result
		System.out.println("Instant : " + It);
	}
}
