/*
 * Java program to illustrate CopyOnWriteArrayList class
 */

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class CopyOn_WriteArrayList extends Thread {

	static CopyOnWriteArrayList l = new CopyOnWriteArrayList();
	
	public void run() {
		// child thread trying to add new element in the Collection object
		l.add("D");
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		l.add("A");
		l.add("B");
		l.add("C");
		
		// We create a child thread that is going to modify ArrayList l
		CopyOn_WriteArrayList t = new CopyOn_WriteArrayList();
		t.run();
		
		Thread.sleep(1000);
		
		// Now we iterate through the ArrayList and get exception
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			Thread.sleep(1000);
		}
		System.out.println(l);
	}
}
