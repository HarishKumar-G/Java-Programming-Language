/*
 * Java program to delete a file
 */

import java.io.*;

public class Delete_A_File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\Copy_A_File\\Text1.txt");
		
		if(file.delete())
			System.out.println("File deleted Successfully");
		else
			System.out.println("Failed to delete the file");
	}
}
