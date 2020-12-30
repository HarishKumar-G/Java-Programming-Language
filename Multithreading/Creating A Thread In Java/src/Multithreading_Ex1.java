/*
 * There are two ways for creating a thread
 * 			1. Thread creation by extending the Thread class
 * 			2. Thread creation by implementing the Runnable Interface
 */
//		Java code for thread creation by extending the Thread class

class Multithread extends Thread {
	
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
		} catch(Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

public class Multithreading_Ex1 {
	public static void main(String[] args) {
		int n = 8;		// number of threads
		for(int i = 0; i < n; i++) {
			Multithread object = new Multithread();
			object.start();
		}
	}
}
