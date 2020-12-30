/*
 * Java program to demonstrate clear() method
 */

import java.nio.*;
import java.util.*;

public class FloatBuffer_Methods_Clear {

	public static void main(String[] args) {
		try {
			float[] farr = {2.5f, 3.5f, 4.5f, 6.7f};
			
			// creating object of FloatBuffer and allocating size capacity
			FloatBuffer fb = FloatBuffer.wrap(farr);
			
			// try to set the position at index 2
			fb.position(2);
			
			// set this buffer mark position using mark() method
			fb.mark();
			
			// try to set the position at index 4
			fb.position(4);
			
			// display position
			System.out.println("Position before reset: " + fb.position());
			
			// try to call clear() to restore to the position at index 0 by discarding the mark
			fb.clear();
			
			// display position
			System.out.println("Position after reset: " + fb.position());
		}
		catch(InvalidMarkException e) {
			System.out.println("New position is less than the position we marked before ");
			System.out.println("Exception throws: " + e);
		}
	}
}
