/*
 * Java program to illustrate reading from FileReader using FileReader
 */

import java.io.*;

public class ReadingFromFile2 {
	public static void main(String[] args) throws Exception {
		
		// pass the path to the file as a parameter
		FileReader fr = new FileReader("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt");
		
		int i;
		while((i=fr.read()) != -1)
			System.out.print((char) i);
	}
}
