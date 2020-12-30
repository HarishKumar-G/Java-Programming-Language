/*
 * Java code for thread creation by implementing the runnable interface
 */

class Multithreading implements Runnable {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		} catch(Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

public class Multithreading_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 8;	// Number of threads
		for (int i = 0; i < 8; i++) {
			Thread object = new Thread(new Multithreading());
			object.start();
		}
	}
}
