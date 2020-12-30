/*
 * Java code to illustrate the use of ListIterator
 */
import java.io.*;
import java.util.*;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");

		// List itr to traverse the list
		java.util.ListIterator<String> itr = list.listIterator();

		// Traversing the list in forwarding direction
		System.out.println("Displaying list elments in forwarding direction: ");

		while(itr.hasNext()) 
			System.out.print(itr.next() + " ");
		System.out.println();

		// Traversing the list in backward direction
		System.out.println("Displaying list elements in backward direction: ");

		while(itr.hasPrevious()) {
			System.out.print(itr.previous() + " ");
		}
	}
}
