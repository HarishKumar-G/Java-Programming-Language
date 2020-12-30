import java.util.Arrays;

// Java Program to demonstrate Arrays.equals() method

public class Methods_In_Java_Array_Example9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 30, 40, 50 };
		int intAry1[] = { 10, 15, 22 };
		
		System.out.println("Integer Arrays on comparison: " + 
		Arrays.equals(intAry, intAry1));
	}
}
