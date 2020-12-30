
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// declaring 2D array with 2 rows
		int ary[][] = new int[2][];
		ary[0] = new int[3];
		ary[1] = new int[2];
		
		int count = 0;
		for (int i = 0; i < ary.length; i++){
			for(int j = 0; j < ary[i].length; j++)
				ary[i][j] = count++;
		}
		
		System.out.println("Contents of 2D Jagged Array: ");
		for(int i = 0; i< ary.length; i++)
		{
			for(int j = 0; j < ary[i].length; j++)
				System.out.print(ary[i][j] + " ");
			System.out.println();
		}
	}
}
