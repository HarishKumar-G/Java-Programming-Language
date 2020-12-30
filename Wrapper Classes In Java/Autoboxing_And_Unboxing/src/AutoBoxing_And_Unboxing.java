/*
 * Java program to illustrate the concept of Auto-boxing and Un-boxing
 */

import java.io.*;

public class AutoBoxing_And_Unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating an Integer Object with value 10
		Integer i = new Integer(10);
		
		// unboxing the object
		int i1 = i;
		
		System.out.println("Value of i : " + i);
		System.out.println("Value of i1: " + i1);
		
		// Autoboxing of char
		Character gfg = 'a';
		
		// Auto-unboxing of Character
		char ch = gfg;
		System.out.println("Value of ch: " + ch);
		System.out.println("Value of gfg: " + gfg);
	}
}
