
public class Remove_Leading_Zeros_From_String_In_Java {

	public static String removeZero(String str) {
		int i = 0;
		while(i < str.length() && str.charAt(i) == '0')
			i++;
		
		StringBuffer sb = new StringBuffer(str);
		
		sb.replace(0, i, "");
		
		return sb.toString();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "00000123569";
		str = removeZero(str);
		System.out.println(str);
	}
}
