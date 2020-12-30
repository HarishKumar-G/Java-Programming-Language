/*
 * Java program to demonstrate the working of collections without double brace initialization
 */
import java.util.HashSet;
import java.util.Set;

public class Working_Of_Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> sets = new HashSet<String>();
		sets.add("one");
		sets.add("two");
		sets.add("three");

		// now pass above collection as parameter to method
		useInSomeMethod(sets);
	}

	private static void useInSomeMethod(Set<String> sets)
	{
		System.out.println(sets);
	}
}
