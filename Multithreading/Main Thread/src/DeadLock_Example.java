/*
 * Java program to demonstrate DEADLOCK using Main Thread
 */

public class DeadLock_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Entering into DeadLock");
			Thread.currentThread().join();
			// the following statement will never execute
			System.out.println("This statement will never execute");
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

/* The statement "Thread.currentThread().join()" will tell Main thread to wait for this 
 * thread(wait for itself) to die. Thus Main thread wait for itself to die, which is nothing but a deadlock.
 */
