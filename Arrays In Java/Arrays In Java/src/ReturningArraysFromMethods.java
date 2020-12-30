
public class ReturningArraysFromMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ary = method();
		for(int i = 0; i < ary.length; i++)
			System.out.printf("ary[%d] : %d\n", i, ary[i]);
	}
	
	public static int[] method(){
		// int[] a = {1, 2, 3, 4, 5};
		// return a;
		
		return new int[]{1, 2, 3};
	}
}
