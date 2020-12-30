/*
 * Java code to illustrate toString() method
 */

import java.time.Duration;

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using parse() method
		Duration duration = Duration.ofHours(5);
		
		// Get the String value using toString() method
		System.out.println(duration.toString());
	}
}
