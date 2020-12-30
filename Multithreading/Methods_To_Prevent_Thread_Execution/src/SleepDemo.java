/*
 * Java program to illustrate sleep() method in Java
 */

import java.lang.*;

public class SleepDemo implements Runnable {
	public void run()
	{
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			try {
				// thread to sleep for 1000 milliseconds
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println(e);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(new SleepDemo());
		
		// call run() function
		t1.start();
		
		Thread t2 = new Thread(new SleepDemo());
		
		// call run() function
		t2.start();
	}
}
