/*
 * Java program to illustrate how to set the name of a thread at time of thread creation
 */

import java.io.*;

// we can create thread by creating the objects of that class
class ThreadNaming extends Thread {

	ThreadNaming(String name) {
		// call to constructor of the Thread class
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread is running...");
	}
}

public class Setting_Thread_Name_Directly {
	public static void main(String[] args) {
		// creating two threads
		ThreadNaming t1 = new ThreadNaming("geek1");
		ThreadNaming t2 = new ThreadNaming("geek2");
		
		// getting the above created thread names
		System.out.println("Thread 1: " + t1.getName());
		System.out.println("Thread 2: " + t2.getName());
		
		t1.start();
		t2.start();
	}
}
