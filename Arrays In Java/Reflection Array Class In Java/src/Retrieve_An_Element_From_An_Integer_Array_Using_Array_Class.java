import java.lang.reflect.Array;
import java.util.Arrays;

public class Retrieve_An_Element_From_An_Integer_Array_Using_Array_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sizeOfArray = 5;
		int[] intArray = (int[])Array.newInstance(int.class, sizeOfArray);
	
		// setInt(): used to store an element in an array using Reflect Array class 
		Array.setInt(intArray, 0, 10);
		Array.setInt(intArray, 1, 20);
		Array.setInt(intArray, 2, 30);

		// getInt(): used to retrieve an element in an array using Reflect Array class 
		System.out.println(Arrays.toString(intArray));
		System.out.println("Element at index 0: " + Array.getInt(intArray, 0));
		System.out.println("Element at index 1: " + Array.getInt(intArray, 1));
		System.out.println("Element at index 2: " + Array.getInt(intArray, 2));
	}
}
