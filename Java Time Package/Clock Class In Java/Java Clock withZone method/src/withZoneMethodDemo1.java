/*
 * Java program to demonstrate withZone() method of clock class
 */

import java.time.*;

public class withZoneMethodDemo1 {
	public static void main(String args[]) {
			
		// create a base Clock with systemDefaultZone() method
		Clock baseClock = Clock.systemDefaultZone();
		
		// print details of ZonedDateTime
		System.out.println("baseClock Zone: " + baseClock.getZone());
		
		// create ZoneId object with Zone Asia/Calcutta
		ZoneId zone = ZoneId.of("Asia/Calcutta");
		
		// apply withZone() to change zone of baseclock to Asia/Calcutta
		Clock clockWithOtherZone = baseClock.withZone(zone);
		
		// print details of ZonedDateTime
		System.out.println("clockWithOtherZone zone: " + clockWithOtherZone.getZone());
	}
}
