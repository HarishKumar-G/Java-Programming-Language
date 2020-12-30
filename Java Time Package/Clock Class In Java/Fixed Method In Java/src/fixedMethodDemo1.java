/*
 * Java program to demonstrate fixed() method of Clock class
 */

import java.time.*;

public class fixedMethodDemo1 {

	public static void main(String[] args) {
		
		// create instance of clock class
		Instant instant = Instant.parse("2018-08-19T16:02:42:00Z");
		
		// create ZoneId object for Asia/Calcutta zone
		ZoneId zoneId = ZoneId.of("Asia/Calcutta");
		
		// create ZoneId object for Asia/Calcutta zone
		Clock clock = Clock.fixed(instant, zoneId);
	}
}
