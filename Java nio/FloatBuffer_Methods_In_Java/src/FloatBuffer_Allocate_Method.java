/*
 * Java program to demonstrate allocate() method
 */

import java.nio.*;
import java.util.*;

public class FloatBuffer_Allocate_Method {

	public static void main(String[] args) {
		
		// Declaring the capacity of the FloatBuffer
		int capacity = 10;
		
		// creating the FfloatBuffer
		// creating object of floatBuffer and allocating size capacity
		FloatBuffer fb = FloatBuffer.allocate(capacity);
		
		// putting the value in floatBuffer
		fb.put(8.56f);
		fb.put(2, 9.61f);
		
		System.out.println("FloatBuffer: " + Arrays.toString(fb.array()));
	}
}
