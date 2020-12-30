/*
 * Java program to illustrate toHoursPart() method
 */

import java.time.Duration;

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using ofHours() method
		Duration duration = Duration.ofHours(10);
		
		System.out.println("Duration: " + duration);
		
		// get the number of hours using toHoursPart() method
		/*
		 * toHoursPart() method is not present
		 * using toHours() method instead, which is gonna be wrong though
		 */
		
//		System.out.println(duration.toHoursPart());
		System.out.println(duration.toHours());
	}

}
