import java.util.*;
import java.io.*;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] a = new Integer[]{1, 2, 3};
		Integer[] b = new Integer[]{4, 5, 6};
		
		List<Object> c = concatenate(a, b);
		
		System.out.println("Merged object array: " + c);
	}
	
	public static <T> List<Object> concatenate(T[] a, T[] b)
	{
		List<Object> n = new ArrayList<>();
		
		Collections.addAll(n, a);
		Collections.addAll(n, b);
		
		return n;
	}
}
