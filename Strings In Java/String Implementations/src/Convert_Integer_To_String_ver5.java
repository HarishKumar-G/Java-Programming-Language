/* Convert using StringBuffer */

public class Convert_Integer_To_String_ver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int f = 1234;
	
	/*	StringBuffer sb = new StringBuffer();
		sb.append(f);
		String str6 = sb.toString();
	(or) */
		String str6 = new StringBuffer().append(f).toString();
		System.out.println("String str6 = " + str6);
	}
}
