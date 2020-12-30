import java.util.function.Function;

public class and_then_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Function which takes in a number and returns half of it
		 */
		Function<Integer, Double> half = a -> a / 2.0;

		/*
		 * Now treble the output of half function
		 */
		half = half.andThen(a -> 3 * a);

		// apply the function to get the result
		System.out.println(half.apply(10));
	}
}
