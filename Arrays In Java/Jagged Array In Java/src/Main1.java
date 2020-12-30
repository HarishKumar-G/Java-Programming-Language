
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r = 5;
		int ary[][] = new int[r][];
		
		for(int i = 0; i < ary.length; i++)
			ary[i] = new int[i + 1];
		
		int count = 0;
		for(int i = 0; i < ary.length; i++)
			for (int j = 0; j < ary[i].length; j++)
				ary[i][j] = count++;
		
		System.out.println("Contents of 2D Jagged Array: ");
		for (int i = 0; i < ary.length; i++)
		{
			for (int j = 0; j < ary[i].length; j++)
				System.out.print(ary[i][j] + " ");
			System.out.println();
		}
	}
}
