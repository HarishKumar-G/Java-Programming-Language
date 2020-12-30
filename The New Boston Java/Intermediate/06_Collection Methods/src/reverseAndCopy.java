import java.util.*;

public class reverseAndCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create an array and covert to list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("List is : ");
		output(l);
		
		// reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse: ");
		output(l);
		
		// create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of lsit to listcopy
		Collections.copy(listCopy, l);
		System.out.println("copy of list: ");
		output(listCopy);
		
		// fill collection with crap
		Collections.fill(l, 'H');
		System.out.println("After filling the List: ");
		output(l);
	}
	
	//output method
	private static void output(List<Character> thelist){
		for(Character thing : thelist)
			System.out.printf("%s ", thing);
		System.out.println();
	}
}
