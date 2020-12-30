
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str = new String[5];
		System.out.print("String array default elements: ");
		for(String s : str)
			System.out.print(s + " ");
	
		int[] a = new int[5];
		System.out.print("\nInt array default elements: ");
		for(int i : a)
			System.out.print(i + " ");
		
		double[] b = new double[5];
		System.out.print("\nDouble array default elements: ");
		for(double i : b)
			System.out.print(i + " ");
		
		boolean[] bool = new boolean[5];
		System.out.print("\nBoolean array default elements: ");
		for(boolean i : bool)
			System.out.print(i + " ");
		
		ArrayDemo ary[] = new ArrayDemo[5];
		System.out.print("\nReference array default elements: ");
		for(ArrayDemo i : ary)
			System.out.print(i + " ");	
	}
}