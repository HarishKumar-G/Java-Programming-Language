/*
 * Java program to demonstrate offset() method of Clock Class
 */

import java.time.*;

public class offsetMethodDemo1 {

	public static void main(String[] args) {
		
		// base Clock with default zone
		Clock realClock = Clock.systemDefaultZone();
		
		// print current time
		System.out.println("Real clock instant is " + realClock.instant());
		
		// Creating another clock with offset 0
		Clock clock = Clock.offset(realClock, Duration.ZERO);
		
		// print new clock
		System.out.println("New clock instant with duration = 0 is " + clock.instant());
		
		// Creating the clock with 24 hours positive offset
		clock = Clock.offset(realClock, Duration.ofHours(24));
		
		// print new clock
		System.out.println("New clock instant with duration = 24 hours is " + clock.instant());
		
		// Creating the clock with 24 hours negative offset
		clock = Clock.offset(realClock, Duration.ofHours(-24));
		
		// print new clock
		System.out.println("New clock instant with Duration = -24hpurs is " + clock.instant());
	}
}
