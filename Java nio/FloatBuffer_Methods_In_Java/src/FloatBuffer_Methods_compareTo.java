/*
 * Java program to demonstrate compareTo() method
 */

import java.nio.*;
import java.util.*;

public class FloatBuffer_Methods_compareTo {

	public static void main(String[] args) {

		// declaring the capacity of the fb
		int capacity = 3;
		
		// creating the FloatBuffer
		try {
			// creating object of floatBuffer fb and allocating size capacity
			FloatBuffer fb = FloatBuffer.allocate(capacity);
			
			// putting the value in fb
			fb.put(9.56f);
			fb.put(7.61f);
			fb.put(4.61f);
			
			// rewind the float buffer
			fb.rewind();
			
			// print the FloatBuffer
			System.out.println("FloatBuffer fb: " + Arrays.toString(fb.array()));
			
			// creating object of floatBuffer fb1 and allocating size capacity
			FloatBuffer fb1 = FloatBuffer.allocate(capacity);
			
			// putting the value in fb1
			fb1.put(9.56f);
			fb1.put(7.61f);
			fb1.put(4.61f);
			
			// rewind the float buffer
			fb1.rewind();
			
			// print the FloatBuffer
			System.out.println("FloatBuffer fb1: " + Arrays.toString(fb1.array()));
			
			// compare both buffer and store the value into integer
			int i = fb.compareTo(fb1);
			
			// if else condition
			if(i == 0)
				System.out.println("\nboth buffer are lexicographically equal");
			else if(i >= 0)
				System.out.println("\nfb is lexicographically greater than fb1");
			else
				System.out.println("\nfb is lexicographically less than fb1");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Exception thrown: " + e);
		} catch(ReadOnlyBufferException e) {
			System.out.println("Exception throws: " + e);
		}
	}
}
