
public class Conversion_from_StringBuffer_To_StringBuilder_or_viceversa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sbuf = new StringBuffer("Geeks");
		
		// conversion from StringBuffer Object to StringBuilder
		String str = sbuf.toString();
		StringBuilder sbl = new StringBuilder(str);
		
		System.out.println(sbl);
	}
}
