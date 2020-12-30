
public class Reversing_A_String_ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "GeeksforGeeks";
		
		byte[] strAsByteArray = input.getBytes();
		byte[] result = new byte[strAsByteArray.length];
		
		for(int i = 0; i < strAsByteArray.length; i++)
			result[i] = strAsByteArray[strAsByteArray.length-i-1];
		System.out.println(new String(result));
	}
}
