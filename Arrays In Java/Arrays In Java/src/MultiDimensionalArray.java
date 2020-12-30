
public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[][] = { {2, 7, 9}, {3, 6, 1}, {7, 4, 2} };
		
		for (int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
	}
}
