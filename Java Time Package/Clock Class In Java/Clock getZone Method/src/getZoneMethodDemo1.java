/*
 * Java Program to demonstrate getZone() method of Clock class
 */

import java.time.*;

public class getZoneMethodDemo1 {

	public static void main(String[] args) {
		
		// create Clock Object
		Clock clock = Clock.systemDefaultZone();
		
		// get TimeZone of Clock object using getZone() method
		ZoneId zoneid = clock.getZone();
		
		// print details of TimeZone
		System.out.println("ZoneId for class " + clock + " is " + zoneid);
	}
}
