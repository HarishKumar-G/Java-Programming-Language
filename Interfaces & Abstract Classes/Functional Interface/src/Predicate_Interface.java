/*
 * A simple JAVA program to demonstrate the use of predicate interface
 */

import java.util.*;
import java.util.function.Predicate;

public class Predicate_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create a list of Strings
		List<String> names = Arrays.asList("Geeks", "GeeksQuiz", "g1", "QA", "Geek2");
		
		/*
		 * Declare the predicate type as string and use lambda expression to create object
		 */
		
		Predicate<String> p = (s)->s.startsWith("G");
		
		// Iterate through the list
		for (String st:names) {
			// call the test method
			if(p.test(st))
				System.out.println(st);
		}
	}
}
