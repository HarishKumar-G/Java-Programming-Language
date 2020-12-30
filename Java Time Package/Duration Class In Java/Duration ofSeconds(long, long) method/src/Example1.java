/*
 * Java code to illustrate ofSeconds() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// input number of seconds
		long noOfSeconds = 214545;
		
		// input nanoSeconds adjustment to be made
		long nanoSecAdjust = 1000;
		
		// Duration using ofSeconds() method
		Duration duration = Duration.ofSeconds(noOfSeconds);
		Duration duration1 = Duration.ofSeconds(noOfSeconds, nanoSecAdjust);
		
		System.out.println("Duration without adjustment: " + duration.getSeconds());
		System.out.println("Duration with adjustment: " + duration1.getSeconds());
	}

}
