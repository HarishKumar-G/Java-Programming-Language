/*
 * Java program to demonstrate hashCode() method of Clock class
 */

import java.time.*;

public class hashCodeMethodDemo1 {

	public static void main(String[] args) {
		
		// create Clock Object
		Clock clock = Clock.systemDefaultZone();
		
		// get hashCode of Clock object using 
		// hashCode() method
		int code = clock.hashCode();
		
		// print details of TimeZone
		System.out.println("hash Code for class " + clock + " is " + code);
	}
}
