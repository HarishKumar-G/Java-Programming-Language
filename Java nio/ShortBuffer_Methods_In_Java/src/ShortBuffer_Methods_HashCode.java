/*
 * Java Program to demonstrate hashCode() method
 */

import java.nio.*;
import java.util.*;

public class ShortBuffer_Methods_HashCode {

	public static void main(String[] args) {
		
		// create short object and assign value to it
		short shortNum1 = 6010;
		Short ShortObj1 = new Short(shortNum1);
		
		// returns hashCode
		int hcode = ShortObj1.hashCode();
		System.out.println("HashCode for this Short ShortObj1 = " + hcode);
	}
}
