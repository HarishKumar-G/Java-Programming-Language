/*
 * Java program to demonstrate system(ZoneId) method of Clock class
 */

import java.time.*;

public class systemMethodDemo2 {
	
	public static void main(String[] args) {
			
		// create a Zone Id for US/Arizona
		ZoneId zoneId = ZoneId.of("US/Arizona");
		
		// create Clock with system(zoneId) method
		Clock clock = Clock.system(zoneId);
		
		// print details of ZoneId of new Clock
		System.out.println("ZoneID of class is " + clock.getZone());
	}
}
