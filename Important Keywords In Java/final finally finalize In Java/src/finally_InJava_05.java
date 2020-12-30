// Java program to illustrate use of finally block

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class finally_InJava_05 {
	private static final int SIZE = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintWriter out = null;
		try {
			System.out.println("Entered try statement");
			out = new PrintWriter(new FileWriter(""));
		}
		catch (IOException e) {	
			// since the FileWriter in try block can throw IOException
		}
		finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter is not open");
			}
		}
	}
}
