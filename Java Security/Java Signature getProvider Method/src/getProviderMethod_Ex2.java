/*
 * Java program to demonstrate getProvider() method
 */

import java.security.*;
import java.util.*;

public class getProviderMethod_Ex2 {

	public static void main(String[] args) {
		try
		{
			// creating the object of Signature
			Signature sr = Signature.getInstance("SHA1withDSA");
			
			// getting the provider by using method getProvider()
			Provider provider = sr.getProvider();
			
			// printing the provider name
			System.out.println("Provider : " + provider);
		} catch(NoSuchAlgorithmException e) {
			System.out.println("Exception thrown : " + e);
		}
	}
}
