/*
 * Java program to demonstrate rewind() method
 */

import java.nio.*;
import java.util.*;

public class IntBufferMethods_rewind {

	public static void main(String[] args) {
		
		// defining and allocating IntBuffer using allocate() method
		IntBuffer intBuffer = IntBuffer.allocate(4);
		
		// put char value in intBuffer using put() method
		intBuffer.put(10);
		intBuffer.put(20);
		
		// print the int buffer
		System.out.println("Buffer before operation: " + Arrays.toString(intBuffer.array()) +
				"\nPosition: " + intBuffer.position() + "\nLimit: " + intBuffer.limit());
		
		// rewind the Buffer using rewind() method
		intBuffer.rewind();
		
		// print the intBuffer
		System.out.println("\nBuffer after operation: " + Arrays.toString(intBuffer.array()) +
				"\nPosition: " + intBuffer.position() + "\nLimit: " + intBuffer.limit());	
	}
}
