// Java program to demonstrate ListIterator

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		for (int i = 0; i < 10; i++) {
			al.add(i);
		}
		System.out.println(al);
		
		/* at beginning itr(cursor) will point to index just before the first element in al */
		ListIterator Itr = al.listIterator();
		
		// checking the next element availability
		while(Itr.hasNext()) {
			// moving cursor to next element
			int i = (Integer)Itr.next();
			
			// getting even elements one by one
			System.out.print(i + " ");
			
			/*
			 * Changing even numbers to odd and adding modified number again in iterator
			 */
			if (i % 2 == 0) {
				i++;
				Itr.set(i);
				Itr.add(i);
			}
		}
		System.out.println();
		System.out.println(al);
	}
}
