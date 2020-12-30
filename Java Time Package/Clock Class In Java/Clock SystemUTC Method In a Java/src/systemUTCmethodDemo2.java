/*
 * Java program to demonstrate systemUTC() method of Clock class
 */

import java.time.*;

public class systemUTCmethodDemo2 {

	public static void main(String[] args) {
		
		// create Clock with systemUTC() method
		Clock clock = Clock.systemUTC();
		
		// get ZoneId of clock
		ZoneId zone = clock.getZone();
		
		// print details of ZoneId of new clock
		System.out.println("ZoneID of class is " + zone);
	}

}
