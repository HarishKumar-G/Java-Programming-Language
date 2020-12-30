/*
 * Java Program to illustrate the need of Synchronization
 */

import java.io.*;

class Multithread
{
	private int i = 0;
	public void increment() {
		i++;
	}
	public int getValue() {
		return i;
	}
}

public class Need_Of_Synchronization {

	public static void main(String[] args) {
		
		Multithread t = new Multithread();
		t.increment();
		System.out.println(t.getValue());
	}
}



