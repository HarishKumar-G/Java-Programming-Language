/*
 * Java program to demonstrate systemUTC() method of Clock class
 */

import java.time.*;

public class systemUTCmethodDemo1 {

	public static void main(String[] args) {
		
		// create clock with systemUTC() method
		Clock clock = Clock.systemUTC();
		
		// get instant of class
		Instant instant = clock.instant();
		
		// get ZonedDateTime object from instantObj to get date time
		ZonedDateTime time = instant.atZone(clock.getZone());
		
		// print details of ZonedDateTime
		System.out.println("ZonedDateTime of class with UTC" + " Time Zone is " + time.toString());
	}
}
