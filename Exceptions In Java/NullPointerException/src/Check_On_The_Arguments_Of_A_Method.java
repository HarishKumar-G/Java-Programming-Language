/*
 * A Java program to demonstrate that we should check if parameters are null or not before using them.
 */
import java.io.*;

public class Check_On_The_Arguments_Of_A_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String s set an empty string and calling getLength()
		String s = " ";
		try
		{
			System.out.println(getLength(s));
		}
		catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException caught");
		}
		
		// String s set to a value and calling getLength()
		s = "GeeksforGeeks";
		try
		{
			System.out.println(getLength(s));
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException Caught");
		}
	
	// Setting s as null and calling getLength()
	s = null;
	try
	{
		System.out.println(getLength(s));
	} 
	catch (IllegalArgumentException e) 
	{
		System.out.println("IllegalArgumentException caught");
	}
}

	
	
   /*
 	* Function to return length of string s. It throws IllegalArgumentException if s is null
 	*/
	public static int getLength(String s)
	{
		if (s == null)
			throw new IllegalArgumentException("The argument cannot be null");
		return s.length();
	}
}
