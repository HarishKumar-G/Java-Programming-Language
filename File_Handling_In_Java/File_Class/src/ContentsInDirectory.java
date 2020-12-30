/*
 * Below program displays the contents of a directory
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContentsInDirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Enter the path and directory name from the keyBoard
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter DirPath: ");
		String dirPath = br.readLine();
		
		System.out.print("Enter the dirname: ");
		String dirName = br.readLine();
		
		// create a File object with dirPath and dirName
		File file = new File(dirPath, dirName);
		
		//if directory exists, then
		if (file.exists())
		{
			//get the contents into arr[], now arr[i] represent either a File or Directory
			String arr[] = file.list();
			
			// find the number of entries in the directory
			int n = arr.length;
			
			// displaying the entries
			for (int i = 0; i < n; i++)
			{
				System.out.print(arr[i]);
				
				// create File object with the entry and test if its a file or directory
				File f1 = new File(arr[i]);
				if(f1.isFile())
					System.out.println(": is a file");
				if(f1.isDirectory())
					System.out.println(": is a directory");
			}
			System.out.println("No of entries in this directory: " + n);
		}
		else
			System.out.println("Directory not found");
	}
}
