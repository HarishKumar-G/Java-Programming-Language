/*
 * Java program to demonstrate toHours() method
 */

import java.time.Duration;

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using ofHours() method
		Duration duration = Duration.ofHours(10);
		
		System.out.println("Duration: " + duration);
		
		// Get the number of hours using toHours() method
		System.out.println(duration.toHours());
	}

}
