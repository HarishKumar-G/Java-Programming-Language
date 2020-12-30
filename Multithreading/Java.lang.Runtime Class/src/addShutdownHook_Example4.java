/*
 * Java program to illustrate addShutdownHook() method of Runtime class
 *
 * If a security manager denies RuntimePermission("shutdownHooks")
 */

public class addShutdownHook_Example4 {
	
	// a class that extends thread that is to be called when program is exiting
	static class Message extends Thread
	{
		public void run() {
			System.out.println("Program exiting");
		}
	}
	
	public static void main(String[] args) {
		
		try
		{
			// register Message as shutdown hook
			Runtime.getRuntime().addShutdownHook(new Message());
			
			// cause thread to sleep for 3 seconds
			System.out.println("Waiting for 5 seconds...");
			Thread.sleep(5000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
