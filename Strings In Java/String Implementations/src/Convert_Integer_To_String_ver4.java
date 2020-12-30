/* convert using DecimalFormat */

import java.text.DecimalFormat;

public class Convert_Integer_To_String_ver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int e = 12345;
		// DecimalFormat df = new DecimalFormat("#");
		// or
		
		DecimalFormat df = new DecimalFormat("#,###");
		String str5 = df.format(e);
		System.out.println(str5);
	}
}
