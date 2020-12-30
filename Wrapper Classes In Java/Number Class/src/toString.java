/*
 * Java program to demonstrate Integer.toString()
 * and Integer.toString(int i) method
 */

public class toString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// demonstrating toString() method
		Integer x = 12;
		
		System.out.println(x.toString());
		
		// demonstrating toString(int i) method
		System.out.println(Integer.toString(12));
		System.out.println(Integer.toBinaryString(152));
		System.out.println(Integer.toHexString(152));
		System.out.println(Integer.toOctalString(152));
	}
}
