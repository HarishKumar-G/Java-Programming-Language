/*
 * Java program to demonstrate toDaysPart() method
 */

import java.time.Duration;

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using ofDays() method
		Duration duration = Duration.ofDays(10);
		System.out.println("Duration: " + duration);
		
		// Get the number of days using toDaysPart() method
//		System.out.println(duration.toDaysPart());
		System.out.println(duration.toDays());
	}
}
