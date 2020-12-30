import java.lang.reflect.Array;
import java.util.Arrays;

public class Add_An_Element_To_An_Integer_Array_Using_Array_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = (int[])Array.newInstance(int.class, 5);
		
		Array.setInt(intArray, 0, 10);
		Array.setInt(intArray, 1, 20);
		Array.setInt(intArray, 2, 30);
		
		System.out.println(Arrays.toString(intArray));
	}
}
