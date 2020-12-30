import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] things = {"eggs", "lasers", "hats", "pie"};
		List<String> list1 = new ArrayList<String>();
		
		//add array items to list
		for(String x : things)
			list1.add(x);
		
		String[] moreThings = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
		
		//add array elements to list
		for(String y : moreThings)
			list2.add(y);
		
		System.out.println("Elements in List1: ");
		for(int i = 0; i < list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
		
		System.out.println("\n\nElements in List2: ");
		for(int i = 0; i < list2.size(); i++)
			System.out.printf("%s ", list2.get(i));
	
		editList(list1, list2);
		System.out.println();
	
		System.out.println("\nElements in List1: ");
		for(int i = 0; i < list1.size(); i++)
			System.out.printf("%s ", list1.get(i));
	}
	
	public static void editList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()){
			if(l2.contains(it.next()))
				it.remove();
		}
	}
}