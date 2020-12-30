/*
 * Java program to demonstrate getInstance() method
 */

import java.security.*;
import java.util.*;

public class getInstance_method_Ex2 {
	public static void main(String[] argv) {
			try
			{
					// creating SecureRandom object
				SecureRandom sr1 = new SecureRandom(new byte[] {1, 2, 3, 4});
				
				// creating Provider Object
				Provider pd = sr1.getProvider();
				
				// creating the object of SecureRandom and getting instance by using getInstance() method
				SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", pd);
				
				// Declaring the String variable
				String str = "TajMahal";
				
				// Declaring the byte array converting string into byte
				byte[] b = str.getBytes();
				
				// printing the byte array
				System.out.println("Byte array before operation: " + Arrays.toString(b));
				
				// generating user-specified number of random bytes using nextBytes() method
				sr.nextBytes(b);
				
				// printing the new byte array
				System.out.println("Byte array after operation : " + Arrays.toString(b));
			}
			catch(NoSuchAlgorithmException e) {
					System.out.println("Exception thrown: " + e);
			}
			catch(ProviderException e) {
					System.out.println("Exception thrown: " + e);
			}
	}
}
