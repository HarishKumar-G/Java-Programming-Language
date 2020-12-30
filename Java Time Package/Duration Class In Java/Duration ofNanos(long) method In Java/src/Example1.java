/*
 * Java code to illustrate ofNanos() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// input number of Nanos
		long noOfNanos = 1000000;
		
		// Duration using ofNanos() method
		Duration duration = Duration.ofNanos(noOfNanos);
		
		System.out.println(duration.getSeconds());
	}

}
