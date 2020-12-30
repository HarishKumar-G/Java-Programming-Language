/*
 * Java program to illustrate copyOnwriteArraySet Class 
 */
import java.util.concurrent.*;
import java.util.*;

public class copyOnWriteArraySetDemo extends Thread {

	static CopyOnWriteArraySet l = new CopyOnWriteArraySet();
	
	public void run()
	{
		// child thread trying to add new element in the Set Object
		l.add("D");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		l.add("A");
		l.add("B");
		l.add("C");
		
		// we create a child thread that is going to modify CopyOnwriteArraySet l.
		copyOnWriteArraySetDemo t = new copyOnWriteArraySetDemo();
		t.start();
		
		// wait for the thread to add the element
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {
			System.out.println("Child going to add element");
		}
		
		System.out.println(l);
		
		// Now we iterate through the copyOnWriteArraySet and we won't get exception
		Iterator itr = l.iterator();
		
		while(itr.hasNext()) {
			String s = (String)itr.next();
			System.out.println(s);
			
			if(s.equals("C")) {
				System.out.println("Found C");
				itr.remove();	// here we'll get the runtime exception
			}
		}
	}
}
