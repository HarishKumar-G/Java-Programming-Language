/*
 * Java program to change the file permissions
 */
import java.io.*;

public class ChangeFilePermissions {

	public static void main(String[] args) {
		
		// creating a new file instance
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt");
		
		// check if file exists
		boolean exists = file.exists();
		if(exists == true)
		{				
			// changing the file permissions
			file.setExecutable(false);
			file.setReadable(true);
			file.setWritable(false);
			System.out.println("File permissions changed");
			
			// printing the permissions associated with the file currently
			System.out.println("Executable: " + file.canExecute());
			System.out.println("Readable: " + file.canRead());
			System.out.println("Writable: " + file.canWrite());
		}
		else
			System.out.println("File not found");
	}
}
