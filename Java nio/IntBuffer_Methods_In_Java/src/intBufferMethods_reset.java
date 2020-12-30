/*
 * Java program to demonstrate reset() method
 */

import java.nio.*;
import java.util.*;

public class intBufferMethods_reset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int[] farr = {10, 20, 30, 40};
			
			// creating object of IntBuffer and allocating size capacity
			IntBuffer ib = IntBuffer.wrap(farr);
			
			// try to set the position at index 2
			ib.position(2);
			
			// Set  this buffer mark position using mark() method
			ib.mark();
			
			// try to set the position at index 4
			ib.position(4);
			
			// display position
			System.out.println("Position before reset: " + ib.position());
			
			// try to call reset() to restore to the position we marked 
			ib.reset();
			
			// display position
			System.out.println("Position after reset: " + ib.position());
		}
		catch(InvalidMarkException e) {
			System.out.println("New position is less than the postion we marked before ");
			System.out.println("Exception throws: " + e);
		}
	}
}
