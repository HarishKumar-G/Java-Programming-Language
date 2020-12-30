/* Program to compare two strings in JAVA */

public class Compare_Two_Strings_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string1 = new String("GeeksForGeeks");
		String string2 = new String("Practice");
		String string3 = new String("Geeks");
		String string4 = new String("Geeks");
		
		System.out.println("Comparing " + string1 + " and " + string2 + " : " + GFG.stringCompare(string1, string2));
		System.out.println("Comparing " + string3 + " and " + string4 + " : " + GFG.stringCompare(string3, string4));
		System.out.println("Comapring " + string1 + " and " + string4 + " : " + GFG.stringCompare(string1, string4));
	}
}

class GFG {
	public static int stringCompare(String str1, String str2){
		int l1 = str1.length();
		int l2 = str2.length();
		int lmin = Math.min(l1, l2);
		
		for (int i = 0; i < lmin; i++){
			int str1_ch = (int)str1.charAt(i);
			int str2_ch = (int)str2.charAt(i);
			
			if(str1_ch != str2_ch)
				return str1_ch - str2_ch;
		}
		
		if (l1 != l2)
			return l1 - l2;
		else
				return 0;
	}
}

