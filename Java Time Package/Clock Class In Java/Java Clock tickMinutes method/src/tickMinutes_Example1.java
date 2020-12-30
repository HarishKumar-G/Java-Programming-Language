/*
 * Java program to demonstrate tickMinutes() method of Clock class
 */

import java.time.*;

public class tickMinutes_Example1 {

	public static void main(String[] args) {
		
		// zone id with Zone Asia/Calcutta
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		
		// create clock which ticks in whole minute
		Clock clock = Clock.tickMinutes(zoneId);
		
		// print instance of clock
		System.out.println(clock.instant());
	}
}
