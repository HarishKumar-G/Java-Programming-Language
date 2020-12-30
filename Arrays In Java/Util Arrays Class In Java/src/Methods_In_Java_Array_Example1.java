import java.util.Arrays;

// Java Program to demonstrate Arrays.asList() method
// static <T>List<T>asList(T...a) : This method returns a fixed size list backed by the specified arrays.

public class Methods_In_Java_Array_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intAry[] = { 10, 20, 30, 40, 50 };
		
		// To convert the elements as List
		System.out.println("Integer Array as List: " + Arrays.asList(intAry));
	}
}
