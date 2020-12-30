/*
 * This program accepts a file or directory path from the command line and checks for its existence
 */

import java.io.File;

// Displaying file property
public class fileProperty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// accept file name or directory name
		String fname = args[0];
		
		// pass the filename or directory name through command line arguments
		/* ***pass this:   R:\PART1\Java\File_Handling_In_Java\File_Class\NewTextDocument.txt *** */
		File f = new File(fname);
		
		// apply File class methods on File Object
		System.out.println("File name: " + f.getName());
		System.out.println("Path: " + f.getPath());
		System.out.println("Absolute Path: " + f.getAbsolutePath());
		System.out.println("Parent: " + f.getParent());
		System.out.println("Exists: " + f.exists());
		
		if(f.exists())
		{
			System.out.println("Is writable: " + f.canWrite());
			System.out.println("Is readable: " + f.canRead());
			System.out.println("Is a directory: " + f.isDirectory());
			System.out.println("File Size in bytes: " + f.length());
		}
	}
}
