
public class StringToStringBuffer_And_StringToStringBuilder_Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Geeks";
		
		// conversion from String Object to StringBuffer
		StringBuffer sbuf = new StringBuffer(str);
		sbuf.reverse();
		System.out.println(sbuf);
		
		// conversion from String Object to StringBuilder
		StringBuilder sbdr = new StringBuilder(str);
		sbdr.append("ForGeeks");
		System.out.println(sbdr);
	}
}
