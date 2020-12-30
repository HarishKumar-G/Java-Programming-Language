/*
 * Java program to demonstrate NullPointerException
 */

public class NullPointerException_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String a = null; //null value
			System.out.println(a.charAt(0));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException...");
		}
	}

}
