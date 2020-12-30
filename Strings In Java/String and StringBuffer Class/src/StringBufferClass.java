public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer s = new StringBuffer("GeeksforGeeks");

		// length of a string buffer can be found by the length() method.
		int p = s.length();
		// total allocated capacity can be found by the capacity() method.
		int q = s.capacity();
		
		System.out.println("Length of string GeeksForGeeks = " + p);
		System.out.println("Capacity of string GeeksForGeeks = " + q);
	}
}
