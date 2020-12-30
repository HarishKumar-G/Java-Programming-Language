import java.util.Arrays;

// Java program to demonstrate Arrays.fill() method

public class Methods_In_Java_Array_Example10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 30, 40, 50 };
		int intKey = 0;
		
		Arrays.fill(intAry, intKey);
		System.out.println("Integer Array on filling: " + Arrays.toString(intAry));
	}
}
