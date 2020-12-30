
public class ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[] = new int[2];
		ary[0] = 10;
		ary[1] = 20;
		
		for(int i = 0; i <= ary.length; ++i)
			System.out.println(ary[i]);
	}

}
