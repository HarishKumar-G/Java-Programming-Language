/* Java Program to demonstrate the working of Objectp[] toArray() */

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		Object[] objects = al.toArray();
		
		for(Object obj : objects)
			System.out.print(obj + " ");
	}
}
