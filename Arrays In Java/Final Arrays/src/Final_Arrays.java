
public class Final_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// defining a final array
		final int ary[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < ary.length; i++){
			ary[i] = ary[i] * 10;
			System.out.print(ary[i] + " ");
		}
	}
}
