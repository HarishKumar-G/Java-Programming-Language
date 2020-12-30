/*
 * Java code to illustrate hashCode() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// Duration using parse() method
		Duration duration = Duration.parse("P2DT3H4M");
		
		// Get the hashCode value using hashCode() method
		System.out.println(duration.hashCode());
	}

}
