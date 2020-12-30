/*
 * Recursive Java program to print all the files in a folder(and sub-folders)
 */

import java.io.File;

public class List_Files_In_A_Directory {
	
	static void RecursivePrint(File[] arr, int index, int level) {
		// terminate condition
		if(index == arr.length)
			return;

		// tabs for internal levels
		for(int i = 0; i < level; i++)
			System.out.print("\t");
		
		// for files
		if (arr[index].isFile())
			System.out.println(arr[index].getName());
		//for sub-directories
		else if(arr[index].isDirectory()) {
			System.out.println("[" + arr[index].getName() + "]");
			
			// recursion for sub-directories
			RecursivePrint(arr[index].listFiles(), 0, level + 1);
		}
		
		// recursion for main directories
		RecursivePrint(arr, ++index, level);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String maindirPath = "R:\\PART1\\Java\\File_Handling_In_Java\\List_Files_In_A_Directory";
		
		// Provide full path for directory(change accordingly)
		File maindir = new File(maindirPath);
		
		if(maindir.exists() && maindir.isDirectory())
		{
			// array of files and sub-directories of directories pointed by maindir
			File arr[] = maindir.listFiles();
			
			System.out.println("**************************************************");
			System.out.println("Files from main directories : " + maindir);
			System.out.println("**************************************************");
			
			// calling recursive method
			RecursivePrint(arr, 0, 0);
		}
	}
}
