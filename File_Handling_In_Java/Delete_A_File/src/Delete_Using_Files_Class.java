/*
 * Java program to demonstrate delete using Files class
 */

import java.io.IOException;
import java.nio.file.*;

public class Delete_Using_Files_Class {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try
		{
			Files.deleteIfExists(Paths.get("R:\\PART1\\Java\\File_Handling_In_Java\\Copy_A_File\\Text1.txt"));
		} catch(NoSuchFileException e) {
			System.out.println("No Such file/directory exists");
		} catch(DirectoryNotEmptyException e) {
			System.out.println("Directory is not empty");
		} catch(IOException e) {
			System.out.println("Invalid permissions");
		}
		System.out.println("Deletion Successfull");
	}
}
