
public class StringMethods_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s = "buckyrobertsbuckyroberts";

		// search for the first occurrence of 'k'
		System.out.println(s.indexOf('k'));
		
		System.out.println(s.indexOf('k', 5));
		
		System.out.println(s.indexOf('x'));
		
		System.out.println(s.indexOf("rob"));
		
		System.out.println(s.indexOf("rob", 10));
	
	
		String a = "Bacon ";
		String b = "monster";
		
		// concatenate Strings
		System.out.println(a + b);
		System.out.println(a.concat(b));
		
		// replace in the string
		System.out.println(a.replace('B', 'F'));
		
		// toUpperCase and toLowerCase
		System.out.println(b.toUpperCase());
		
		
		b = "       monster       ";
		System.out.println(b + "\n" + b.trim());
	}
}
