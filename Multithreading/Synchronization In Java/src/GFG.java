/*
 * A Java program to demonstrate working of synchronized.
 */

import java.io.*;
import java.util.*;

// a class used to send a message
class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try {
			Thread.sleep(1000);
		} catch(Exception e) {
			System.out.println("Thread interrupted.");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

// Class for send a message using Threads
class SyncDemo extends Thread {

	private String msg;
	Sender sender;
	
	// Receives a message object and a string message to be sent
	SyncDemo(String m, Sender obj) {
		msg = m;
		sender = obj;
	}
	
	public void run() {
		// Only one thread can send a message at a time
		synchronized(sender) {
			// synchronizing the send object 
			sender.send(msg);
		}
	}
}

public class GFG extends Thread {
	public static void main(String[] args) {
		Sender snd = new Sender();
		SyncDemo S1 = new SyncDemo(" Hi ", snd);
		SyncDemo S2 = new SyncDemo(" Bye ", snd);
		
		// Start two threads of ThreadedSend
		S1.start();
		S2.start();
		
		// wait for threads to end
		try
		{
			S1.join();
			S2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
	}
}
