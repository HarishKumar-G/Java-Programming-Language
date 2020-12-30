import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;

public class Example3 {

	public static <T> Object[] concatenate(T[] a, T[] b)
	{
		Object[] n = new Object[a.length + b.length];
		System.arraycopy(a, 0, n, 0, a.length);
		System.arraycopy(b, 0, n, a.length, b.length);
		return n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = new Integer[]{1, 2, 3};
		Integer[] b = new Integer[]{4, 5, 6};
		
		Object[] c = concatenate(a, b);
		
		System.out.println("Merged object array: " + Arrays.toString(c));
	}
}
