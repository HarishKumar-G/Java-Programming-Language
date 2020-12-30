/* Convert using StringBuilder */

public class Convert_Int_To_String_ver6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int g = 1234;
	/*	StringBuilder sb = new StringBuilder();
		sb.append(g);
		String str7 = sb.toString();
	or */
		String str7 = new StringBuilder().append(g).toString();
		System.out.println("String str7 = " + str7);
	}
}
