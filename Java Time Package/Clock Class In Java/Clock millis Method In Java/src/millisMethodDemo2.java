/*
 * Java program to demonstrate millis() method of Clock class
 */

import java.time.*;

public class millisMethodDemo2 {
	
	public static void main(String[] args) {
			ZoneId zoneId = ZoneId.of("Europe/Paris");
			
			Clock clock = Clock.system(zoneId);
			
			long milliseconds = clock.millis();
			
			System.out.println("Instant for clock class in milli seconds is " + milliseconds);
	}
}

