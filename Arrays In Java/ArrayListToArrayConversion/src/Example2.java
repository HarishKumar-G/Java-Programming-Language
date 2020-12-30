import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

//	Error: Incompatible Types: Object[] cannot be converted to Integer[]		
//		Integer[] objects = al.toArray();

		Object[] objects = al.toArray();

		for(Object obj : objects)
			System.out.println(obj);
	}
}
