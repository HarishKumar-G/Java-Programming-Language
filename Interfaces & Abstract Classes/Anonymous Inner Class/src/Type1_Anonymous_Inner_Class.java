/*
 * Based on the declaration and behaviour, there are three types of anonymous inner classes
 * 
 * 1. Anonymous inner class that extends a class
 * 2. Anonymous inner class that implements a interface
 * 3. Anonymous inner class that defines inside method/constructor argument
 */



/*
 * This is a JAVA program to illustrate creating an immediate thread using Anonymous Inner Class
 * that extends a class
 */

public class Type1_Anonymous_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Here we are using Anonymous Inner Class that extends a class i.e., here a thread class
		 */
		Thread t = new Thread()
		{
			public void run() {
				System.out.println("Child Thread");
			}
		};
		
		t.start();
		System.out.println("Main Thread");
	}
}

/* OUTPUT CAN BE
 * 
 * Main Thread
 * Child Thread
 * OR
 * Child Thread
 * Main Thread
 */
