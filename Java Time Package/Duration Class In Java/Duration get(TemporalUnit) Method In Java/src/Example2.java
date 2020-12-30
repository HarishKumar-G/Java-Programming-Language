/*
 * Java program to demonstrate get() method
 */

import java.time.Duration;
import java.time.temporal.*;

public class Example2 {

	public static void main(String[] args) {
		
		// get the text
		String time = "P2DT3H4M";
		
		// Duration using parse() method
		Duration duration = Duration.parse(time);
		
		try
		{
			// Duration using get() method
			long getMinutes = duration.get(ChronoUnit.MINUTES);
		} catch(Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}
