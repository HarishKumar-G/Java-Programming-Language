/*
 * Java program to illustrate reading from FileReader using BufferedReader
 */

import java.io.*;

public class ReadFromFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * We need to provide file path as the parameter:
		 * Double quotes is to avoid compiler interpret words like \test as \t (i.e., as escape sequence)
		 */
		
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st = br.readLine()) != null)
			System.out.println(st);
	}
}
