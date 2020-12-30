/*
 * Java program to create a Sequential Stream from an Iterator
 */
import java.util.*;
import java.util.stream.*;

public class Using_Iterable_Spliterator {

	// function to create a sequential stream from an iterator
	public static <T> Stream<T> iteratorToSequentialStream(Iterator<T> itr) {
		// get an iterable from itr
		Iterable<T> itb = () -> itr;
		
		// get spliterator() from iterable and then convert into a sequential stream
		// The second parameter "false" passess whether the stream is to be created parallel or not
		return StreamSupport.stream(itb.spliterator(), false);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iterator<String> iterator = Arrays.asList("G", "E", "E", "K", "S").iterator();
		Stream<String> stream = iteratorToSequentialStream(iterator);
		System.out.println("Sequential Stream : " + stream.collect(Collectors.toList()));
	}
}
