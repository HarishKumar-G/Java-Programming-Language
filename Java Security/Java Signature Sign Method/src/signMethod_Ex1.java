/*
 * Java program to demonstrate sign() method
 */

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.util.*;

public class signMethod_Ex1 {

	public static void main(String[] args) throws UnsupportedEncodingException, InvalidKeyException {
		
		try
		{
			//  calling getKeyPair() method and assigning in keypair
			KeyPair keypair = getKeyPair();
			
			// creating byte array object
			byte[] outbuff = new byte[1000];
			
			// data to be updated
			byte[] data = "test".getBytes("UTF8");
			
			// creating the object of signature
			Signature sr = Signature.getInstance("SHA1WithRSA");
			
			// initializing the signature object with key pair for signing
			sr.initSign(keypair.getPrivate());
			
			// update the data
			sr.update(data);
			
			// getting the number of bytes placed in outbuffer by using method sign()
			int bytes = sr.sign(outbuff, 0, 550);
			
			// printing the number of byte
			System.out.println("Signature : " + bytes);
		}
		catch(NoSuchAlgorithmException e){
			System.out.println("Exception thrown: " + e);
		}
		catch(SignatureException e) {
			System.out.println("Exception thrown: " + e);
		}
	}

	// defining getKeyPair method
	private static KeyPair getKeyPair() throws NoSuchAlgorithmException {
		// creating the object of keyPairGenerator
		KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
		
		// initialising with 1024
		kpg.initialize(1024);
		
		// returning the key pairs
		return kpg.genKeyPair();
	}
}

