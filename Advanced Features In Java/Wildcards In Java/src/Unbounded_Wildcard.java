/*
 * Java program to demonstrate Unbounded wildcard
 */
import java.util.Arrays;
import java.util.List;

public class Unbounded_Wildcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// integer list
		List<Integer> list1 = Arrays.asList(1, 2, 3);
		
		// double list
		List<Double> list2 = Arrays.asList(1.1, 2.2, 3.3);
		
		printlist(list1);
		printlist(list2);
	}
	
	private static void printlist(List<?> list) {
		System.out.println(list);
	}
}
