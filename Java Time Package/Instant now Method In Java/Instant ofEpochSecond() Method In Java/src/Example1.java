/*
 * Java program to demonstrate Instant.ofEpochSecond() method
 */

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		
		// long epochsecond value
		long epochSecond = 12000001;
		
		// apply ofEpochSecond method of Instant class
		Instant result = Instant.ofEpochSecond(epochSecond);
		
		// print results
		System.out.println("Instant: " + result);
	}

}
