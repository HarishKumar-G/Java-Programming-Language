import java.util.Arrays;

public class Methods_In_Java_Array_Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 15, 22, 35 };
		
		System.out.println("Integer Array: " + Arrays.toString(intAry));
		System.out.println("\nNew Arrays by copyOf:\n");
		System.out.println("Integer Array: " + Arrays.toString(Arrays.copyOf(intAry, 10)));
	}
}
