/*
 * Java program to demonstrate Instant.ofEpochSecond() method
 */

import java.time.*;

public class Example2 {

	public static void main(String[] args) {
		
		long epochSecond = 1200000001;
		long nanoadjustment = 9999991;
		
		// apply ofEpochSecond method of Instant class
		Instant result = Instant.ofEpochSecond(epochSecond, nanoadjustment);
		
		// print results
		System.out.println("Instant: " + result);
	}

}
