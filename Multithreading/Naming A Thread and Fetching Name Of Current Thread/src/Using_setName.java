/*
 * Java program to illustrate how to get and change the name of a thread
 */

import java.io.*;

// we can create thread by creating the objects of that class
class SetNameUsage extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class Using_setName {
	public static void main(String[] args) {
		// creating two threads
		SetNameUsage t1 = new SetNameUsage();
		SetNameUsage t2 = new SetNameUsage();
		
		// getting the above created threads names.
		System.out.println("Thread 1: " + t1.getName());
		System.out.println("Thread 2: " + t2.getName());
		
		t1.start();
		t2.start();
		
		// Now changing the name of threads.
		t1.setName("geeksforgeeks");
		t2.setName("geeksquiz");
		
		// again getting the new names of the threads
		System.out.println("Thread names after changing the thread names");
		System.out.println("New Thread 1 name: " + t1.getName());
		System.out.println("New Thread 1 name: " + t2.getName());
	}
}

