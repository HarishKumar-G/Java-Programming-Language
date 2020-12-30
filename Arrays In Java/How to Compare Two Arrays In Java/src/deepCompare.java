import java.util.Arrays;

public class deepCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inAry1[] = { 1, 2, 3 };
		int inAry2[] = { 1, 2, 3 };
		
		Object[] arr1 = {inAry1};	// arr1 contains only one element
		Object[] arr2 = {inAry2};	// arr2 also contains only one element
		
//		if(Arrays.equals(arr1, arr2))	// Arrays.equals() won't be not able to do deep comparison.
		if(Arrays.deepEquals(arr1, arr2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
