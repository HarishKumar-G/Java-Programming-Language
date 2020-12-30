
public class Converting_String_To_Character_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "GeeksforGeeks";
		
		char[] try1 = input.toCharArray();
		
		for(int i = try1.length-1; i >= 0; i--)
			System.out.print(try1[i]);
	}
}
