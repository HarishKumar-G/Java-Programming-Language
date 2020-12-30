import java.util.Arrays;

public class Sorting {
	public static void main(String args[]){
		int ary[] = { 13, 7, 6, 45, 21, 9, 101, 102 };
		
		Arrays.sort(ary);
		System.out.printf("Modified ary[]: %s", Arrays.toString(ary));

	}
}