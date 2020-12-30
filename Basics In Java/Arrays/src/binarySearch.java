import java.util.Arrays;

public class binarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ary[] = { 10, 20, 15, 22, 35 };
		Arrays.sort(ary);
		
		int key = 22;
		int res = Arrays.binarySearch(ary, key);
		if (res >= 0)
			System.out.println(key + " found at index " + res);
		else
			System.out.println(key + " not found");
		
		key = 40;
		res = Arrays.binarySearch(ary, key);
		if (res >= 0)
			System.out.println(key + " found at index " + res);
		else
			System.out.println(key + " not found");
	}
}
