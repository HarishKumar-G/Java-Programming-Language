
public class Reverse_A_String_Using_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String input = "Geeks For Geeks";
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		
		input1 = input1.reverse();
		
		System.out.println(input1);
	}
}
