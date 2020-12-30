
public class Final_Arrays3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ary1[] = {1, 2, 3, 4, 5};
		int ary2[] = {10, 20, 30, 40, 50};

		ary2 = ary1;

// Error: final member can not be assigned 
//		ary1 = ary2;

		for(int i = 0; i < ary2.length; i++)
			System.out.print(ary2[i] + " ");
	}
}
