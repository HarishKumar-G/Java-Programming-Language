/*
 * Java program to demonstrate isDirect() method
 */

import java.nio.*;
import java.util.*;

public class ShortBuffer_Methods_IsDirect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short[] array = { 10000, 10640, 10189, -2000, -16780 };
		
		// creating short array
		ShortBuffer shortBuf1 = ShortBuffer.wrap(array);
		
		// checking if the array is direct or not
		if (shortBuf1.isDirect()) {
			System.out.println("Short buffer is direct.");
		} else {
			System.out.println("Short buffer is not direct.");
		}
	}
}
