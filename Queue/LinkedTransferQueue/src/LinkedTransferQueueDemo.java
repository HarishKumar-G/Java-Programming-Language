/*
 * Java program to demonstrate LinkedTransferQueue
 */

import java.util.concurrent.LinkedTransferQueue;
import java.util.*;

public class LinkedTransferQueueDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * create object of LinkedTransferQueue using LinkedTransferQueue() constructor
		 */
		LinkedTransferQueue<Integer> LTQ = new LinkedTransferQueue<Integer>();
		
		// Adding numbers to end of LinkedTransferQueue
		LTQ.add(7855642);
		LTQ.add(35658786);
		LTQ.add(5278367);
		LTQ.add(74381793);
		
		// print Dequeue
		System.out.println("Linked Transfer Queue1: " + LTQ);
		
		// create object of LinkedTransferQueue using LinkedTransferQueue(Collection c) constructor
		LinkedTransferQueue<Integer> LTQ2 = new LinkedTransferQueue<Integer>(LTQ);
		
		// print Dequeue
		System.out.println("Linked Transfer Queue2: "+ LTQ2);
	}
}
