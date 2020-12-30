// Java program to demonstrate Iterator

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}

		System.out.println(al);

		/* at beginning itr(cursor) will point to index just before the first element in al */
		Iterator itr = al.iterator();

		// checking the next element availability
		while (itr.hasNext()) {

			// moving cursor to next element
			int i = (Integer)itr.next();

			// getting even elements one by one
			System.out.print(i + " ");

			// removing old elements
			if (i % 2 != 0)
				itr.remove();
		}
		System.out.println();
		System.out.println(al);
	}
}
