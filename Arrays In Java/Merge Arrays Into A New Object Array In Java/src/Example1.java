/* Java program to merge two arrays of same type into an Object array */

import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;

public class Example1 {

	public static <T> Object[] concatenate(T[] a, T[] b)
	{
		return Stream.of(a, b).flatMap(Stream::of).toArray();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = new Integer[]{1, 2, 3};
		Integer[] b = new Integer[]{4, 5, 6};
		
		Object[] c = concatenate(a, b);
		
		System.out.println("Merged object array : " + Arrays.toString(c));
	}
}
