import java.util.Arrays;

public class Methods_In_Java_Array_Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intAry = { 10, 20, 15, 22, 35 };
		int intKey = 22;
		
		Arrays.sort(intAry);
		
		System.out.println(intKey + " found at index = " + Arrays.binarySearch(intAry, 2, 4, intKey));
	}
}
