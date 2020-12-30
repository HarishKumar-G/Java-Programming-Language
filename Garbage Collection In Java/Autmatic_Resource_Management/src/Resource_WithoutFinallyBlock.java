/*
 * Java program to illustrate Automatic Resource Management in Java without finally block
 */

import java.io.*;
import java.io.*;
import java.util.*;

public class Resource_WithoutFinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
		BufferedReader br = null;
		
		System.out.println("Enter the file path: ");
		br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			str = br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// try with Resource, note the syntax difference
		try (BufferedReader b = new BufferedReader(new FileReader(str)))
		{
			String s;
			while((s = br.readLine()) != null)
				System.out.println(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
