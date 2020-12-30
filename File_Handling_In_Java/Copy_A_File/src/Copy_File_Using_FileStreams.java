/*
 * Java program to copy a source file to destination
 * 
 * Source and Destination file names shall be provided through command lines
 * arg[0] and arg[1]
 */

import java.io.*;

public class Copy_File_Using_FileStreams {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		 * If file does not exist FileInputStream throws FileNotFoundException
		 * read() and write() will throw IOException if I/O error occurs
		 */
		
		FileInputStream fis = new FileInputStream(args[0]);
		// assuming the file is present and need not be checked

		FileOutputStream fos = new FileOutputStream(args[1]);
		
		int b;
		while((b = fis.read()) != -1)
			fos.write(b);
		
		fis.close();
		fos.close();
	}
}
