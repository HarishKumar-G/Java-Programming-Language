/*
 * Java program to demonstrate equals() method of Clock class
 */

import java.time.Clock;
import java.time.ZoneId;

public class EqualsMethodDemo1 {

	public static void main(String[] args) {
		// create clock object which represents UTC zone time using system()
		Clock clock1 = Clock.system(ZoneId.of("Etc/UTC"));
		
		// print clock1 details
		System.out.println(clock1.toString());
		
		// Create another class Object using clock class systemDefaultZone method
		Clock clock2 = Clock.systemDefaultZone();
		
		// Print Clock2 details
		System.out.println(clock2.toString());
	}
}
