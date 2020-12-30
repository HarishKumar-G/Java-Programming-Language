/*
 * JAVA program to illustrate defining a thread using Anonymous inner class that define inside argument
 */

public class Type3_Anonymous_Inner_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Here we are using anonymous inner class that define inside argument, here constructor argument
		 */
		
		Thread t = new Thread(new Runnable()
		{
			public void run() {
				System.out.println("Child Thread");
			}
		});
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