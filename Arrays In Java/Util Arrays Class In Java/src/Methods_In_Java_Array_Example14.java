import java.util.Arrays;

// Java program to demonstrate Arrays.sort() method */
/* sort(originalArray, fromIndex, endIndex) */

public class Methods_In_Java_Array_Example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 15, 22, 35, 25 };
		
		Arrays.sort(intAry, 1, 3);
		
		System.out.println("Integer Array: " + Arrays.toString(intAry));
	}
}
