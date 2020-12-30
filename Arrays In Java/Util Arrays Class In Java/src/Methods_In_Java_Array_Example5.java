import java.util.Arrays;

// Java program to demonstrate Arrays.copyOfRange() method

public class Methods_In_Java_Array_Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 30, 40, 50 };
		System.out.println("Integer Array: " + Arrays.toString(intAry));
		System.out.println("\nNew Arrays by copyOfRange:\n");
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOfRange(intAry, 1, 3)));
	}
}
