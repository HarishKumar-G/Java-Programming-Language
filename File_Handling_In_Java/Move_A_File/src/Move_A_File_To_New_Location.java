/*
 * Java program to illustrate renaming and moving a file permanently to a new location
 */

import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class Move_A_File_To_New_Location {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Path temp = Files.move(Paths.get("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt"), Paths.get("R:\\PART1\\Java\\File_Handling_In_Java\\NewTextDoc.txt"));
		
		if(temp != null)
		{
			System.out.println("File renamed and moved successfully");
		} else {
			System.out.println("Failed to move the file");
		}
	}
}