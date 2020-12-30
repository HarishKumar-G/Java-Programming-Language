// Java program to demonstrate final with for-each statement
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ary[] = { 1, 2, 3 };
		
		for (final int i : ary)
			System.out.println(i + " ");
	}
}
