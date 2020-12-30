import java.util.stream.*;
import java.util.*;
import java.io.*;

public class Example4 {

	public static <T> Object[] concatenate(T[] a, T[] b)
	{
		List<Object> n = new ArrayList<>();
		
		Stream.of(a, b).flatMap(Stream::of).forEach(n::add);
		
		return n.toArray();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = new Integer[]{1, 2, 3};
		Integer[] b = new Integer[]{4, 5, 6};
		
		Object[] c = concatenate(a, b);
		
		System.out.println("Merged object array: " + Arrays.toString(c));
	}
}
