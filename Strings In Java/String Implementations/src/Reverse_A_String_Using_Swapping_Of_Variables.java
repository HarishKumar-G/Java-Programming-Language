
public class Reverse_A_String_Using_Swapping_Of_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "GeeksforGeeks";
		
		char[] tempArray = input.toCharArray();
		int left, right=0;
		right = tempArray.length-1;
		
		for(left = 0; left < right; left++, right--)
		{
			char temp = tempArray[left];
			tempArray[left] = tempArray[right];
			tempArray[right] = temp;
		}
		
		for(char c : tempArray)
			System.out.print(c);
		System.out.println();
	}
}
