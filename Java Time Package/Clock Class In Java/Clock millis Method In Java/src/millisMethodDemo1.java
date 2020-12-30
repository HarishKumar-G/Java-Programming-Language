/*
 * Java program to demonstrate millis() method of Clock class
 */

import java.time.*;

public class millisMethodDemo1 {

	public static void main(String[] args) {
		
		// create clock object
		Clock clock = Clock.systemDefaultZone();
		
		// get instant object of clock object in milliseconds using millis() method
		long milliseconds = clock.millis();
		
		// print details of milliseconds variable
		System.out.println("Instant for class name " + clock + " in milliseconds is " + milliseconds);
	}
}
