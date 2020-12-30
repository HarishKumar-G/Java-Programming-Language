/*
 * Java code to illustrate AbstractQueue
 */

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class AbstractQueue_Implementation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Creating object of AbstractQueue of AbstractQueue<Integer>
		AbstractQueue<Integer> AQ = new LinkedBlockingQueue<Integer>();
		
		//Populating AQ
		AQ.add(10);
		AQ.add(20);
		AQ.add(30);
		AQ.add(40);
		AQ.add(50);
		
		// print AQ
		System.out.println("AbstractQueue contains: " + AQ);
	}
}
