import java.util.ArrayList;

public class ArrayIndexOutOfBoundsExceptionUsingArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();
		list.add("My");
		list.add("Name");
		System.out.println(list.get(2));
	}
}
