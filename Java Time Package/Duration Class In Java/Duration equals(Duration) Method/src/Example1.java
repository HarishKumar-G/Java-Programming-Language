/*
 * Java program to demonstrate equals() method
 */

import java.time.Duration;

public class Example1 {

	public static void main(String[] args) {
		
		// Duration using parse() method
		Duration duration1 = Duration.parse("P2DT3H4M");
		
		// Duration using ofDays() method
		Duration duration2 = Duration.ofDays(10);
		
		// Compare the duration using equals() method
		System.out.println(duration1.equals(duration2));
		
		
		System.out.println(duration1);
		System.out.println(duration2);
	}
}
