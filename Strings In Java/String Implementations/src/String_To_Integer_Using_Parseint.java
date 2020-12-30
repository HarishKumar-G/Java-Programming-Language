// Java program to demonstrate the working of parseInt()

public class String_To_Integer_Using_Parseint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int decimalExample = Integer.parseInt("20");
		int signedPositiveExample = Integer.parseInt("+20");
		int signedNegativeExample = Integer.parseInt("-20");
		int radixExample = Integer.parseInt("20", 16);
		int stringExample = Integer.parseInt("geeks", 29);
		
		// examples for getting number format exception
		
	/*	
	 * String invalidArguments = "";
		int emptyString = Integer.parseInt(invalidArguments);
		int outOfRangeInteger = Integer.parseInt("geeksforgeeks", 29);
		int domainOfRangeNumberSystem = Integer.parseInt("geeks", 28);
	*/	
		System.out.println(decimalExample);
		System.out.println(signedPositiveExample);
		System.out.println(signedNegativeExample);
		System.out.println(radixExample);
		System.out.println(stringExample);
	}
}
