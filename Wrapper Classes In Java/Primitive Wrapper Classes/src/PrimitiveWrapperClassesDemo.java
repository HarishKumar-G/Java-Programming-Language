/*
 * Java program to demonstrate that primitive wrapper classes are immutable
 */

public class PrimitiveWrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i = new Integer(12);
		System.out.println(i);
		modify(i);
		System.out.println(i);
	}

	private static void modify(Integer i) {
		i = i + 1;
	}
}
