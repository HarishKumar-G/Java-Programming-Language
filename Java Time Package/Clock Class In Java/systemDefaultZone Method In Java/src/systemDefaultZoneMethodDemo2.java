/*
 * Java program to demonstrate systemDefaultZone() method of Clock class
 */
import java.time.*;

public class systemDefaultZoneMethodDemo2 {

	public static void main(String[] args) {
		
		// create Clock with sytemDefaultZone() method
		Clock clock = Clock.systemDefaultZone();
		
		// get ZoneID of Clock
		ZoneId zone = clock.getZone();
		
		// print details of ZoneId of new Clock
		System.out.println("ZoneID of class is " + zone);
	}
}
