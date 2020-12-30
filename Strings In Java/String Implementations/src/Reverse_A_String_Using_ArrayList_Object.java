import java.util.*;

public class Reverse_A_String_Using_ArrayList_Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Geeks For Geeks";
		char[] hello = input.toCharArray();
		
		List<Character> trail1 = new ArrayList<>();
		
		for(char c : hello)
			trail1.add(c);
		
		Collections.reverse(trail1);
		ListIterator<Character> li = trail1.listIterator();
		
		while(li.hasNext())
			System.out.print(li.next());
	}
}
