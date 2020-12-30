/*
 * Java program to demonstrate getZone() method of 
 * Clock class
 */

import java.time.*;

public class getZoneMethodDemo2 {

	public static void main(String[] args) {
		
		// create Clock Object
		Clock clock = Clock.systemDefaultZone();
		
		// get TimeZone of Clock Object using getZone()
		ZoneId zoneid = clock.getZone();
		
		// print details of TimeZone
		System.out.println("ZoneId for Class " + clock + " is " + zoneid);
	}
}
