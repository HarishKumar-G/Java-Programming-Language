/*
 * Java program to demonstrate fixed() method of Clock Class
 */

import java.time.*;

public class fixedMethodDemo2 {

	public static void main(String[] args) {
		
		// create instance of clock class
		Instant instant = Instant.now();
		
		// create ZoneId for defaultZone() which is UTC
		ZoneId zoneId = ZoneId.systemDefault();
		
		// call fixed method
		Clock clock = Clock.fixed(instant, zoneId);
		
		// print details of clock
		System.out.println(clock.toString());
	}
}
