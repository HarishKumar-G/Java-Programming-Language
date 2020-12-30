/*
 * Java program to check the current file permissions
 */

import java.io.*;

public class CurrentFilePermissions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating a file instance
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt");
		
		// check if the file exists
		boolean exists = file.exists();
		if(exists == true) {
			// printing the permissions associated with the file
			System.out.println("Executable: " + file.canExecute());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canRead());
		} else {
			System.out.println("File not found.");
		}
	}

}
