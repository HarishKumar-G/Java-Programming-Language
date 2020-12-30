/*
 * Java program to check if the given file is hidden or not
 */

import java.io.File;
import java.io.IOException;

public class HiddenFileCheck {

	public static void main(String[] args) throws IOException, SecurityException {
		// TODO Auto-generated method stub
		
		// provide the complete file path here
		File file = new File("R:\\PART1\\Java\\File_Handling_In_Java\\Check_File_Hidden\\text.txt");
		
		if (file.isHidden())
			System.out.println("The specified file is hidden");
		else
			System.out.println("The specified file is not hidden");
	}
}
