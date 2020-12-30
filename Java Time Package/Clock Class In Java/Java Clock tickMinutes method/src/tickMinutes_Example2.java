/*
 * Java program to demonstrate tickMinutes() method Clock class
 */

import java.time.*;

public class tickMinutes_Example2 {

	public static void main(String[] args) {
		
		// Zone id with Zone Europe/Paris
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		
		// create clock which ticks in whole minute
		Clock clock = Clock.tickMinutes(zoneId);
		
		// get ZonedDateTime object to print time
		ZonedDateTime time = clock.instant().atZone(clock.getZone());
		
		// print instance of clock
		System.out.println(clock.instant());
	}
}
