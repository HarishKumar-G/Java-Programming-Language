/*
 * Java program to demonstrate instant() method of clock class
 */

import java.time.*;

public class instantMethodDemo2 {

	public static void main(String[] args) {
		
		// Create a Zone Id for Europe/Paris
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		
		// Create Clock Object by passing zoneID
		Clock clock = Clock.system(zoneId);
		
		// get instant object of clock object using instant() method
		Instant instantObj = clock.instant();
		
		// get ZonedDateTime object from instantObj to get zonal date time
		ZonedDateTime time = instantObj.atZone(clock.getZone());
		
		// print details of instant object
		System.out.println("Instant for class " + " is " + time.toString());
	}
}
