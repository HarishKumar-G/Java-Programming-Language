import java.util.ArrayList;
import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] ary = new int[3];
		ary[0] = 1;
		ary[1] = 2;
		ary[2] = 3;
		
		ArrayList<Integer> aryL = new ArrayList<Integer>(2);
		aryL.add(1);
		aryL.add(2);

		System.out.println(Arrays.toString(ary));		
		System.out.println(aryL);
	}
}
