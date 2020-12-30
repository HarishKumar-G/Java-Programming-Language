/*
 * Java program to illustrate reading from Text File using Scanner Class
 */

import java.io.File;
import java.util.Scanner;

public class ReadFromFile3 {
	public static void main(String[] args) throws Exception {
		// pass the path to the file as a parameter
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
			System.out.println(sc.nextLine());
	}
}
