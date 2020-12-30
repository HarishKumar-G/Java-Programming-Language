/*
 * Java program to create a Sequential Stream from an Iterator
 */

import java.util.*;
import java.util.stream.*;

public class Sequential_Stream {

	/*
	 * Function to create a Sequential Stream from an Iterator
	 */
	public static <T> Stream<T> iteratorToSequentialStream(Iterator<T> itr) {
		// convert the iterator into a Spliterator
		Spliterator<T> spitr = Spliterators.spliteratorUnknownSize(itr, Spliterator.NONNULL);
		
		// convert the Spliterator into a sequential stream.
		// The second parameter "false" passess whether the stream is to be created parallel or not
		
		return StreamSupport.stream(spitr, false);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterator<String> iterator = Arrays.asList("G", "E", "E", "K", "S").iterator();
		Stream<String> stream = iteratorToSequentialStream(iterator);
		
		System.out.println("Sequential Stream : " + stream.collect(Collectors.toList()));
	}
}
