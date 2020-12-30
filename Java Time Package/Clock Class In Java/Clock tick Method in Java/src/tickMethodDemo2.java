/*
 * Java program to demonstrate tick() method of Clock Class
 */

import java.time.*;

public class tickMethodDemo2 {

	public static void main(String[] args) {
		
		// create base Clock with systemUTC() method
		Clock baseclock = Clock.systemUTC();
		
		// get instant of base class and print instant
		Instant instant = baseclock.instant();
		System.out.println("Instance of Base class " + instant);
		
		// apply tick method for duration of 10 minutes
		Clock clock1 = Clock.tick(baseclock, Duration.ofMillis(10));
		System.out.println("Instant of Clock1 when duration " + "= 10 minutes is " + clock1.instant());
		
		// apply tick method for the duration of 2 hours
		Clock clock2 = Clock.tick(baseclock, Duration.ofHours(2));
		System.out.println("Instant of Clock2 when duration " + "= 2 hours is " + clock2.instant());
		
		// apply tick method for duration of 5 days
		Clock clock3 = Clock.tick(baseclock, Duration.ofDays(5));
		System.out.println("Instant of Clock2 when duration " + "= 5 days is " + clock3.instant());
	}
}
