/*
 * Java program to demonstrate withZone() method of Clock class
 */

import java.time.*;

public class withZoneMethodDemo {

	public static void main(String[] args) {
		
		// create a base clock with systemUIC() method
		Clock baseClock = Clock.systemUTC();
		
		// get ZonedDateTime object from baseClock clock instant to get date time
		ZonedDateTime baseTime = baseClock.instant().atZone(baseClock.getZone());
		
		// print details of ZonedDateTime
		System.out.println("ZonedDateTime of baseClock " + baseTime.toString());
		
		// create ZoneId object with Zone Asia/Calcutta
		ZoneId zone = ZoneId.of("Asia/Calcutta");
		
		// apply withZone() to change zone from utc to Asia/Calcutta
		Clock clockWithOtherZone = baseClock.withZone(zone);
		
		// get ZonedDateTime object from clockWithOtherZone clock instant to get date time
		ZonedDateTime calcuttaTime = clockWithOtherZone.instant().atZone(clockWithOtherZone.getZone());
		
		// print details of ZonedDatetime
		System.out.println("ZonedDateTime of clockWithOtherZone " + calcuttaTime.toString());
	}
}
