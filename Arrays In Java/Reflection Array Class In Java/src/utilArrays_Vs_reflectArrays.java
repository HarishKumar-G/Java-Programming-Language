import java.lang.reflect.Array;
import java.util.Arrays;

/* *
 * The java.util.Arrays class contains various methods for manipulating arrays 
 * (such as sorting and searching) whereas this java.lang.reflect.Array class 
 * provides static methods to dynamically create and access Java arrays. This Array 
 * class keeps the array to be type-safe.
 * */

public class utilArrays_Vs_reflectArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// get the size of the array
		int[] intArray = new int[5];
		
		// Add elements into the array using reflect.Array class
		Array.setInt(intArray, 0, 10);
		
		// Printing the Array content using util.Arrays class
		System.out.println(Arrays.toString(intArray));
	}
}
