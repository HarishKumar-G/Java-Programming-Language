/*
 * Java program to demonstrate systemDefaultZone() method of Clock class
 */

import java.time.*;

public class systemDefaultZoneMethodDemo1 {

	public static void main(String[] args) {
		
		// create Clock with systemDefaultZone() method
		Clock clock = Clock.systemDefaultZone();
		
		// get instant of class
		Instant instant = clock.instant();
		
		// get ZonedDateTime object from instantObj to get date time
		ZonedDateTime time = instant.atZone(clock.getZone());
		
		// print details of ZonedDateTime
		System.out.println("ZonedDateTime of class " + "with default Zone is " + time.toString());
	}
}
