import java.lang.reflect.Array;
import java.util.Arrays;

public class GFG {

	public static void main(String[] args) {

		int[] intArray = (int[])Array.newInstance(int.class, 5);
		System.out.println(Arrays.toString(intArray));
	}
}
