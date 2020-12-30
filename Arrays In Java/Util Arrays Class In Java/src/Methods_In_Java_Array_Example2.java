import java.util.Arrays;

// Java program to demonstrate Arrays.binarySearch() method

public class Methods_In_Java_Array_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 15, 22, 35 };
		
		Arrays.sort(intAry);
		int intKey = 22;
		System.out.println(intKey + " is found at index = " + Arrays.binarySearch(intAry, intKey));
	}
}
