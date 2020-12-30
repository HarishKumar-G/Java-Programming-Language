/*
 * Java program to demonstrate Instant.now() method in Java
 */

import java.time.*;


public class Example1 {

	public static void main(String[] args) {
		
		// create an Instant Object
		Instant It = Instant.now();
		
		// print result
		System.out.println("Instant : " + It);
	}

}
