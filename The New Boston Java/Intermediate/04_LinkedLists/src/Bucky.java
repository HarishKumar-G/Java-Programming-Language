import java.util.*;

public class Bucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] things = {"apples", "noobs", "pwnge", "bacon", "goats"};
		List<String> list1 = new LinkedList<String>();
		for(String x : things)
			list1.add(x);
		
		String[] morethings = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for(String y : morethings)
			list1.add(y);
		
		list1.addAll(list2);
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
	}

	//printMe method
	private static void printMe(List<String> l){
		for(String x : l)
			System.out.printf("%s ", x);
		System.out.println();
	}
	
	//removeStuff method
	private static void removeStuff(List<String> l, int from, int to) {
		l.subList(from, to).clear();
	}
	
	//reverseMe method
	private static void reverseMe(List<String> l){
		ListIterator<String> bobby = l.listIterator(l.size());
		while(bobby.hasPrevious())
			System.out.printf("%s ", bobby.previous());
	}
}
