import java.util.AbstractSequentialList;
import java.util.LinkedList;

/*
 * Java code to illustrate AbstractSequentialList
 */

public class Abstract_Sequential_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an instance of the AbstractSequentialList
		AbstractSequentialList<Integer> abs1 = new LinkedList<>();
		
		// adding elements to abs1
		abs1.add(5);
		abs1.add(6);
		abs1.add(7);
		
		// Printing the list
		System.out.println(abs1);
	}
}
