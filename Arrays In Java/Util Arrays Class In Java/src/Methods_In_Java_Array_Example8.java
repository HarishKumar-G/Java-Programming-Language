/* This method returns a string representation of the “deep contents” of the specified Arrays */
import java.util.Arrays;

public class Methods_In_Java_Array_Example8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[][] = {{ 10, 20, 30, 40, 50 }};
		
		System.out.println("Integer Array: " + Arrays.deepToString(intAry));
	}
}
