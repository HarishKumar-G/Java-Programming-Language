/* Convert with special radix */

public class Convert_Integer_To_String_ver7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int h = 255;
		
		// binary
		String binaryString = Integer.toBinaryString(h);
		// octal
		String octalString = Integer.toOctalString(h);
		// hexaDecimal
		String hexString = Integer.toHexString(h);
		
		// custom Base/Radix
		// gives representation of the number 255 when written in the base 7 system
		String customString = Integer.toString(h, 7);
		
		System.out.println(binaryString);
		System.out.println(octalString);
		System.out.println(hexString);
		System.out.println(customString);
	}
}
