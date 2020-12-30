import java.util.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleStream stream = DoubleStream.of(3.4, 4.5, 6.7, 8.9);
		stream.mapToObj(num ->{return num * num * num;}).forEach(System.out::println);
	}

}
