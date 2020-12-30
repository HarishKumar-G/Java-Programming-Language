/*
 * Java program to demonstrate tick() method in Java
 */

import java.time.*;

public class tickMethodDemo1 {

	public static void main(String[] args) {
		
		// create base Clock with systemDefaultZone() method
		Clock baseclock = Clock.systemDefaultZone();
		
		// get instant of base class and print instant
		Instant instant = baseclock.instant();
		System.out.println("Instant of Base Class : " + instant);
		
		// apply tick method for duration of 30 seconds and create clock1 and print instant of clock1
		Clock clock1 = Clock.tick(baseclock, Duration.ofSeconds(30));
		System.out.println("Instant of Clock1 " + clock1.instant());
		
		// apply tick method for Duration of 10Seconds and create clock2 and print instant of clock2
		Clock clock2 = Clock.tick(baseclock,  Duration.ofSeconds(10));
		System.out.println("Instant of Clock2 " + clock2.instant());
		
		Clock clock3 = Clock.tick(baseclock, Duration.ofSeconds(3));
		System.out.println("Instant of Clock3 " + clock3.instant());
	}
}
