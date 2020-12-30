/* Java Program to demonstrate enumeration */

import java.util.Vector;
import java.util.Enumeration;

public class enumeration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a vector and print its contents
		Vector  v = new Vector();
		for (int i = 0; i < 10; i++)
			v.addElement(i);
		System.out.println(v);
		
		/* At beginning e(cursor) will point to index just before the first element in v */
		java.util.Enumeration e = v.elements();
		
		// checking the next element availability
		while (e.hasMoreElements()) {
			// moving cursor to next element
			int i = (Integer)e.nextElement;
			System.out.print(i + " ");
		}
	}
}
