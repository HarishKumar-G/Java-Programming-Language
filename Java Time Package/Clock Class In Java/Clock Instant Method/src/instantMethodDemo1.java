/*
 * Java program to demonstrate instant() method of Clock class
 */

import java.time.*;

public class instantMethodDemo1 {

	public static void main(String[] args) {
		
		// create clock object
		Clock clock = Clock.systemDefaultZone();
		
		// get instant Object of Clock object using instant() method
		Instant instantObj = clock.instant();
		
		// print details of Instant Object
		System.out.println("Instant for class " + clock + " is " + instantObj);
	}
}
