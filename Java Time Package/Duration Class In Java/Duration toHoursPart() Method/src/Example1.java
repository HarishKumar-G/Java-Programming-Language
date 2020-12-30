/*
 * Java program to illustrate toHoursPart() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// Duration using parse() method
		Duration duration = Duration.parse("P2DT3H4M");
		System.out.println("Duration: " + duration);
		
		// Get the number of hours using toHoursPart() method
		
		
		
		/*
		 * Well actually toHoursPart() method is not present in 'java.time.Duration' package
		 * using toHours() instead, which is not correct
		 */
		// System.out.println(duration.toHoursPart());
		System.out.println(duration.toHours());
	}

}
