/*
 * Java program to demonstrate compact() method
 */

import java.nio.DoubleBuffer;
import java.util.Arrays;

public class DoubleBuffer_Methods_compact {
	public static void main(String[] args) {
		// Declaring the capacity of the DoubleBuffer
		int capacity = 10;
		
		// creating the DoubleBuffer
		
		// creating object of DoubleBuffer and allocating size capacity
		DoubleBuffer db = DoubleBuffer.allocate(capacity);
		
		// putting the value in DoubleBuffer
		db.put(8.56f);
		db.put(9.61f);
		db.put(9.61f);
		
		// print the DoubleBuffer
		System.out.println("Original DoubleBuffer: " + Arrays.toString(db.array()));
		
		System.out.println("Position: " + db.position());
		
		System.out.println("limit: " + db.limit());
		
		// creating a compacted DoubleBuffer of same DoubleBuffer using compact() method
		DoubleBuffer DoubleBuffer = db.compact();
		
		// print the DoubleBuffer
		System.out.println("\nCompacted DoubleBuffer: " + Arrays.toString(DoubleBuffer.array()));
		
		System.out.println("Position: " + DoubleBuffer.position());
		
		System.out.println("Limit: " + DoubleBuffer.limit());
		
		// putting the value in compacted DoubleBuffer
		DoubleBuffer.put(9.61f);
		
		// print the DoubleBuffer
		System.out.println("\nUpdated Compacted DoubleBuffer: " + Arrays.toString(DoubleBuffer.array()));
		System.out.println("Position: " + DoubleBuffer.position());
		System.out.println("Limit: " + DoubleBuffer.limit());
	}
}
