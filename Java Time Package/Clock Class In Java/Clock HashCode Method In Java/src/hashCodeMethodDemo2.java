/*
 * Java program to demonstrate hashCode() method
 * of Clock class
 */

import java.time.*;

public class hashCodeMethodDemo2 {

	public static void main(String[] args) {
		
		// create a Zone Id for Calcutta
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		
		// create Clock Object by passing zoneID
		Clock clock = Clock.system(zoneId);
		
		// get hash Code of Clock object using
		// hashCode() method
		int code = clock.hashCode();
		
		// print details of TimeZone
		System.out.println("hashCode for clock object " + clock + " is " + code);
	}
}
