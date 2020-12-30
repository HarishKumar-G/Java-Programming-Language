import java.util.Arrays;

// Java Program to demonstrate Arrays.deepEquals() method
/* This method returns true if the two specified arrays are deeply equal to one another */
public class Methods_In_Java_Array_Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[][] = {{ 10, 20, 30, 40, 50 }};
		int intAry1[][] = {{ 10, 15, 22 }};
		
		System.out.println("Integer Arrays on Comparison: " + Arrays.deepEquals(intAry, intAry1));
	} 
}
