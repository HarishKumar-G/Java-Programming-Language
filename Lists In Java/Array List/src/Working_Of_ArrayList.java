/*
 * Java program to demonstrate working of ArrayList in JAVA
 */

import java.io.*;
import java.util.*;

public class Working_Of_ArrayList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// size of ArrayList
		int n = 5;
		
		// declaring ArrayList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		
		// Appending the new element at the end of the list
		for (int i = 1; i <= n; i++) {
			arrli.add(i);
		}
		
		// printing array elements
		System.out.println(arrli);
		
		// remove element at index 3
		arrli.remove(3);
		
		// displaying Arraylist after deletion
		System.out.println(arrli);
		
		// printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
			System.out.print(arrli.get(i) + " ");
	}
}
