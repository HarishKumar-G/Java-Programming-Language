/*
 * Java program to illustrate cleaning of resources before Java 7
 */

import java.io.*;
import java.util.*;
import java.io.*;

public class Resource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		String str = " ";
		
		System.out.println("Enter the file path: ");
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			str = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try
		{
			String s;
			// file resource
			br = new BufferedReader(new FileReader(str));
			
			while((s = br.readLine()) != null) {
				// print all the lines in the text file
				System.out.println(s);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		finally 
		{
			try
			{
				if (br != null)
					// closing the resource in finally block
					br.close();
			} catch(IOException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("Done");
	}
}
