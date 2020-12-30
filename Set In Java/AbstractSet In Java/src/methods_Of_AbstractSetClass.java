/*
 * Java code to illustrate methods of AbstractSet Class
 */
import java.util.*;

public class methods_Of_AbstractSetClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		try {
			// Creating object of AbstractSet<Integer>
			AbstractSet<Integer> abs_set = new TreeSet<Integer>();

			// populating abs_set
			abs_set.add(1);
			abs_set.add(2);
			abs_set.add(3);
			abs_set.add(4);
			abs_set.add(5);

			// print abs_set
			System.out.println("Abstract Set before removeAll() Operation: " + abs_set);

			// creating another object of ArrayList<Integer>
			Collection<Integer> arrlist2 = new ArrayList<Integer>();
			arrlist2.add(1);
			arrlist2.add(2);
			arrlist2.add(3);

			// print arrlist2
			System.out.println("Collection elements to be removed: " + arrlist2);

			// Removing elements from AbstractSet specified in arrlist2 using removeAll() method
			abs_set.removeAll(arrlist2);

			// print arrlist1
			System.out.println("AbstractSet after removeAll() operation: " + abs_set);			
		}
		catch (NullPointerException e) {
			System.out.println("Exception thrown: " + e);
		}
	}
}
