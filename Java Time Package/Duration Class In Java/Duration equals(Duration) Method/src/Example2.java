/*
 * Java program to demonstrate equals() method
 */

import java.time.Duration;

public class Example2 {

	public static void main(String[] args) {
		
		// Duration using ofHours() method
		Duration duration1 = Duration.ofHours(5);
		
		// Duration using ofHours() method
		Duration duration2 = Duration.ofHours(5);
		
		// Compare the duration using equals() method
		System.out.println(duration1.equals(duration2));
		
		
		System.out.println(duration1);
		System.out.println(duration2);
	}
}
