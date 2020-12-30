/* Java code to illustrate StringBuilder */

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str = new StringBuilder();
		str.append("GFG");
		System.out.println("String = " + str.toString());
		
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC");
		System.out.println("String1 = " + str1.toString());
		
		StringBuilder str2 = new StringBuilder(10);
		System.out.println("String2 capacity = " + str2.capacity());
		
		StringBuilder str3 = new StringBuilder(str1);
		System.out.println("String3 = " + str3.toString());
	}
}
