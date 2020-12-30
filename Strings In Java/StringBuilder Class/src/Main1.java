
public class Main1 {
	public static void main(String args[]) throws Exception {
		StringBuilder str = new StringBuilder("AAAABBBCCCC");
		System.out.println("String = " + str.toString());
		
		StringBuilder reverseStr = str.reverse();
		System.out.println("Reverse String = " + reverseStr.toString());
		
		str.appendCodePoint(44);
		
		System.out.println("Modified StringBuilder = " + str);
		
		int capacity = str.capacity();
		
		System.out.println("StringBuilder = " + str);
		System.out.println("Capacity of StringBuilder = " + capacity);
	}
}
