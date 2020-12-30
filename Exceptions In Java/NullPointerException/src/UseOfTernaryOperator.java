/*
 * A Java program to demonstrate that we can use ternery operator to avoid NullPointerException
 */
import java.io.*;

public class UseOfTernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializing String variable with null value
		String str = null;
		String message = (str == null) ? "" : str.substring(0, 5);
		System.out.println(message);
	
		// Initializing String value with some value
		str = "GeeksforGeeks";
		message = (str == null) ? "" : str.substring(0, 5);
		System.out.println(message);
	}	
}
