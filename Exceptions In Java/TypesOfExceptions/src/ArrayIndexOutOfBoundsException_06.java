/*
 * Java program to demonstrate ArrayIndexOutOfBoundsException
 */

public class ArrayIndexOutOfBoundsException_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[5];
			a[6] = 9;	// accessing 7th element in an array of size 5
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds");
		}
	}

}
