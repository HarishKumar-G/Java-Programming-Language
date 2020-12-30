import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;

public class Example2 {

	public static <T> Object[] concatenate(T[] a, T[] b)
	{
		return Stream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = new Integer[]{10, 20, 30};
		Integer[] b = new Integer[]{4, 5, 6};
		
		Object[] c = concatenate(a, b);
		
		System.out.println("Merged object array: " + Arrays.toString(c));
	}
}
