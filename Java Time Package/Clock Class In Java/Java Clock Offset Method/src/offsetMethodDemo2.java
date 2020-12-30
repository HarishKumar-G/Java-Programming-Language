/*
 * Java program to demonstrate offset() method of Clock class
 */

import java.time.*;

public class offsetMethodDemo2 {

	public static void main(String[] args) {
		
		// create a Zone Id for Europe/Paris
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		
		// base Clock with default zone
		Clock realClock = Clock.system(zoneId);
		
		// print current time
		System.out.println("Real clock instant is " + realClock.instant());
		
		// Creating the clock with 50 seconds positive effect
		Clock clock = Clock.offset(realClock, Duration.ofSeconds(50));
		
		// print new clock
		System.out.println("Time after 50 seconds later than real Clock is " + clock.instant());
		
		// Creating the clock with 30 minutes positive offset
		clock = Clock.offset(realClock, Duration.ofMinutes(30));
		
		// print new clock
		System.out.println("Time after 30 minutes later than real clock is " + clock.instant());
	}
}
