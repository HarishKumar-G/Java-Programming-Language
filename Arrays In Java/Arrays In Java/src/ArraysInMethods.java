
public class ArraysInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[] = {2, 4, 6, 8, 5};
		change(ary);
		
		for (int i:ary)
			System.out.print(i + " ");
	}
	
	public static void change(int[] a){
		for(int i = 0; i<a.length; ++i){
			a[i] += 5;
		}
	}
}
