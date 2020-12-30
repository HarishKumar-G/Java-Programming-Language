/*
 * Java program to demonstrate limit() method
 */

import java.nio.*;
import java.util.*;

public class intBufferMethods_Limit {

	public static void main(String[] args) {
		
		// defining and allocating IntBuffer using allocate() method
		IntBuffer intBuffer = IntBuffer.allocate(4);
		
		// put int value in IntBuffer using put() method
		intBuffer.put(20);
		intBuffer.put(30);
		
		// print the int buffer
		System.out.println("IntBuffer before " + "setting buffer's limit: " + 
				Arrays.toString(intBuffer.array()) + "\nPosition: " + intBuffer.position() + "\nLimit: "
				+ intBuffer.limit());
		
		// Limit the intBuffer using limit() method
		intBuffer.limit(1);
		
		// print the the buffer
		System.out.println("\n intBuffer after setting buffer's limit: " + Arrays.toString(intBuffer.array())
		+ "\nPosition: " + intBuffer.position() + "\nLimit: " + intBuffer.limit());
	}
}
