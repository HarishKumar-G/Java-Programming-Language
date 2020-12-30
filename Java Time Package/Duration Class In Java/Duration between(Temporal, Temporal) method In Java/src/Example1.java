/*
 * Java code to illustrate between() method
 */

import java.time.*;

public class Example1 {

	public static void main(String[] args) {
		
		// Duration using between() method
		Duration duration = Duration.between(LocalTime.MIDNIGHT, LocalTime.NOON);
		System.out.println(duration.getSeconds());
	}

}
