/*
 * Java program to demonstrate toString() method
 */

import java.security.*;
import java.util.*;

public class toStringMethod_Ex1 {

	public static void main(String[] args) {
		try
		{
			// creating the object of Signature
			Signature sr = Signature.getInstance("SHA1withDSA");
			
			// getting the String representation by using method toString()
			String status = sr.toString();
			
			// printing the provider name
			System.out.println("Status : " + status);
		} catch(NoSuchAlgorithmException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
