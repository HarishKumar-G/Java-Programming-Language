// Java Program to compare two strings lexicographically

public class Compare_Two_Strings_Using_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str1 = "GeeksforGeeks";
		String str2 = "Practice";
		String str3 = "Geeks";
		String str4 = "Geeks";
		String str5 = "geeks";
                
		System.out.println("Comparing " + str1 + " and " + str2 + " : " + str1.equals(str2));
		System.out.println("Comparing " + str3 + " and " + str4 + " : " + str3.equals(str4));
		System.out.println("Comparing " + str4 + " and " + str5 + " : " + str4.equals(str5));
		System.out.println("Comparing " + str1 + " and " + str4 + " : " + str1.equals(str4));
	}
}
