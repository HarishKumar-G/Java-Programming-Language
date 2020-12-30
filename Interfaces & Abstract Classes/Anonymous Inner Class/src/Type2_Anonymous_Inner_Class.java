/*
 * Java program to illustrate defining a thread using Anonymous inner class that implements an interface
 */

public class Type2_Anonymous_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Here we are using Anonymous inner class that implements a interface i.e., here runnable interface
		 */
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		System.out.println("Main Thread");
	}
}

/*
 * OUTPUT CAN BE
 * 
 * Main Thread
 * Child Thread
 * OR
 * Child Thread
 * Main Thread
 */