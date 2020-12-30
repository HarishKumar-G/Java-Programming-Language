
public class ConversionFromStringBuffer_and_StringBuilder_To_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbuf = new StringBuffer("Geeks");
		StringBuilder sbdr = new StringBuilder("Hello");
		
		// conversion from StringBuffer Object to String
		String str = sbuf.toString();
		System.out.println("StringBuffer object to String :");
		System.out.println(str);
		
		// conversion from StringBuilder Object to String
		String str1 = sbdr.toString();
		System.out.println("StringBuilder object to String: ");
		System.out.println(str1);
		
		// changing StringBuffer object sbuf but String Object(str) doesn't change
		sbuf.append("ForGeeks");
		System.out.println(sbuf);
		System.out.println(str);
	}
}
