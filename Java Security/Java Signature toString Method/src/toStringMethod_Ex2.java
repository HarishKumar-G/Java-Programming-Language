/*
 * Java program to demonstrate toString() method
 */

import java.security.*;
import java.util.*;

public class toStringMethod_Ex2 {

	public static void main(String[] args) {
		try
		{
			// creating the object of Signature
			Signature sr = Signature.getInstance("NONEwithDSA");
			
			// getting the String representation by using method toString()
			String status = sr.toString();
			
			// printing the provide name
			System.out.println("Status : " + status);
		} catch(NoSuchAlgorithmException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
