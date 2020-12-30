/*
 * Java program demonstrate tickSeconds() method of Clock class
 */

import java.time.*;

public class tickSecondsMethodDemo2 {

	public static void main(String[] args) {
		
		// Zone Id with Zone Europe/Paris
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		
		// create clock which ticks in whole second
		Clock clock = Clock.tickSeconds(zoneId);
		
		// get ZonedDateTime object to print time
		ZonedDateTime time = clock.instant().atZone(clock.getZone());
		
		// print time variable value
		System.out.println("Date and Time: " + time);
	}
}
