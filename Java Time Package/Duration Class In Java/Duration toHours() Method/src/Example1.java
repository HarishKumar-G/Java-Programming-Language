/*
 * Java program to demonstrate toHours() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// Duration using parse() method
		Duration duration = Duration.parse("P2DT3H4M");
		
		System.out.println("Duration: " + duration);
		
		// Get the numbers of hours using toHours method
		System.out.println(duration.toHours());
	}

}
