import java.util.*;

/* Java program to demonstrate the difference between array and arraylist*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ary = new int[2];
		ary[0] = 1;
		ary[1] = 2;
		System.out.println(ary[0]);
		
		ArrayList<Integer> aryL = new ArrayList<Integer>(2);
		aryL.add(1);
		aryL.add(2);
		
		System.out.println(aryL.get(0));
	}
}
