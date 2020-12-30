/*
 * Java program to demonstrate flip() method
 */

import java.nio.*;
import java.util.*;

public class FloatBuffer_Methods_flip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare and initialize the double array
		float[] db = { 10.56f, 20.34f, 30.78f};
		
		// wrap the float array into FloatBuffer using wrap() method
		FloatBuffer floatBuffer = FloatBuffer.wrap(db);
		
		// set position at index 1
		floatBuffer.position(1);
		
		// print the buffer
		System.out.println("Buffer before flip: " + Arrays.toString(floatBuffer.array())
		+ "\nPosition: " + floatBuffer.position() + "\nLimit: " + floatBuffer.limit());
		
		// Flip the buffer using flip() method
		floatBuffer.flip();
		
		// print the buffer
		System.out.println("\nBuffer after flip: " + Arrays.toString(floatBuffer.array())
		+ "\nPostion: " + floatBuffer.position() + "\nLimit: " + floatBuffer.limit());	
	}
}
