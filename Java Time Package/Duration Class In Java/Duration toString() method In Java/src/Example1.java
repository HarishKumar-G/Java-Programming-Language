/*
 * Java program to illustrate toString() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// Duration using parse() method
		Duration duration = Duration.parse("P2DT3H4M");
		
		// get the String value using toString() method
		System.out.println(duration.toString());
	}

}
