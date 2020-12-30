/*
 * Java code to illustrate equals() method
 */

import java.time.Duration;

public class Example3 {

	public static void main(String[] args) {
		
		// Duration using ofDays() method
		Duration duration1 = Duration.ofDays(5);
		
		// Duration using ofHours() method
		Duration duration2 = Duration.ofHours(5);
		
		// Compare the durations using equals()  method
		System.out.println(duration1.equals(duration2));
	
		System.out.println(duration1);
		System.out.println(duration2);
	}

}
