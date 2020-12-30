/*
 * Java program to demonstrate equals() method of Clock class
 */

import java.time.Clock;
import java.time.ZoneId;

public class EqualsMethodDemo2 {

	public static void main(String[] args) {
		
		// Create a class Object using clock class systemDefaultZone method
		Clock clock1 = Clock.systemDefaultZone();
		
		// Print Clock1 Zone details
		System.out.println("clock1 time zone = " + clock1.getZone());
		
		// Create another class object using clock class systemUTC method
		Clock clock2 = Clock.systemUTC();
		
		// print Clock2 zone detials
		System.out.println("clock2 time zone = " + clock2.getZone());
		
		// check whether both clock objects are equal or not
		boolean equalresponse = clock1.equals(clock2);
		
		
		// print result
		System.out.println("Both clocks are equal: " + equalresponse);
	}
}
