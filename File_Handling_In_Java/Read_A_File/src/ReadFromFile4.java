/*
 * Using Scanner class but without loops
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\File_Class\\NewTextDocument.txt");
		Scanner sc = new Scanner(file);
		
		// we just need to use \\Z as delimiter
		sc.useDelimiter("\\Z");
		
		System.out.println(sc.next());
	}

}
