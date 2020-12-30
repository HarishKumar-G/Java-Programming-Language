/*
 * Java program to demonstrate redirection of OutputStream  **System.out to A File**
 */

import java.io.*;

public class SystemFact {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		// Creating a file object that represents the disk file
		PrintStream o = new PrintStream(new File("R:\\PART1\\Java\\File_Handling_In_Java\\Redirecting_System.out_To_A_File\\A.txt"));
		
		// Store current System.out before assigning a new value
		PrintStream console = System.out;
		
		// Assign o to the output stream
		System.setOut(o);
		System.out.println("This will be written to the text file");
		
		// Use stored value for output stream
		System.setOut(console);
		System.out.println("This will be written on the console");
	}
}
