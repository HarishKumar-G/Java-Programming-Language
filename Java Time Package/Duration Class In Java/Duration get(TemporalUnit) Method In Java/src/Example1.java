/*
 * Java program to demonstrate get() method
 */

import java.time.Duration;
import java.time.temporal.*;

public class Example1 {

	public static void main(String[] args) {
		
		// Get the Text
		String time = "P2DT3H4M";
		
		// Duration using parse() method
		Duration duration = Duration.parse(time);
		
		// Duration using get() method
		long getSeconds = duration.get(ChronoUnit.SECONDS);
		System.out.println("Seconds: " + getSeconds);
		
		// Duration using get() method
		long getNanos = duration.get(ChronoUnit.NANOS);
		System.out.println("Nanos: " + getNanos);
	}

}
