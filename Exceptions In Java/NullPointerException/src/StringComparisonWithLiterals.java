/*
 * A java program to demonstrate that invoking a method 
 * on null causes NullPointerException
 */
import java.io.*;

public class StringComparisonWithLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ptr = null;
		try
		{
			if (ptr.equals("gfg"))
				System.out.println("Same");
			else
				System.out.println("Not Same");
		}
		
		catch(NullPointerException e) {
			System.out.println("NullPointerException Caught");
		}
	}
}
