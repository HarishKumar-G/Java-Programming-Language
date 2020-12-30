import java.util.function.Function;

public class compose_method_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Function which takes in a number and return half of it
		 */
		Function<Integer, Double> half = a -> a / 2.0;
		
		try {
			// try to pass null as parameter
			half = half.compose(null);
		} catch (Exception e) {
			System.out.println("Exception Thrown" + "while passing null: " + e);
		}
	}
}
