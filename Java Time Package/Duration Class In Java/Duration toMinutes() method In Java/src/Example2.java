/*
 * Java program to demonstrate toMinutes() method
 */

import java.time.Duration;

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using ofMinutes() method
		Duration duration = Duration.ofMinutes(10);
		System.out.println("Duration: " + duration);
		
		// get the number of minutes using toMinutes() method
		System.out.println(duration.toMinutes());
	}
}
