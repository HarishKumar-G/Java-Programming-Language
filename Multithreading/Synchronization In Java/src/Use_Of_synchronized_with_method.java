/*
 * An alternate implementation to demonstrate that we can use synchronized with method also
 */

class Sender {

	public synchronized void send(String msg) {
		System.out.println("Sending\t" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Thread Interrupted");
		}
		System.out.println("\n" + msg + "Sent");
	}
}
