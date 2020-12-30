/*
 * Java program to demonstrate tickSeconds() method of Clock class
 */

import java.time.*;

public class tickSecondsMethodDemo1 {

	public static void main(String[] args) {
		
		// Zone id with zone Asia/Calcutta
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		
		// create clock which ticks in whole second
		Clock clock = Clock.tickSeconds(zoneId);
		
		// print instance of clock
		System.out.println(clock.instant());
	}
}
