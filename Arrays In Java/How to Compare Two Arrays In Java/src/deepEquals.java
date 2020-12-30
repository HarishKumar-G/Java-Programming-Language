import java.util.Arrays;

public class deepEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inAry1[] = { 1, 2, 3 };
		int inAry2[] = { 1, 2, 3 };
		
		Object[] arr1 = {inAry1};
		Object[] arr2 = {inAry2};
		
		Object[] outArr1 = {arr1};
		Object[] outArr2 = {arr2};
		
		if (Arrays.deepEquals(outArr1, outArr2))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
