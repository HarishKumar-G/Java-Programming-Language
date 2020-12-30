/*
 *  To use randomUUID functions
 */
import java.util.UUID;
import java.io.*;

class ClassSingleton {

	private static ClassSingleton single = null;
	private String ID = null;
	
	private ClassSingleton() {
	/*
	 * Make it private, in order to prevent the creation of new instances of the Singleton class.
	 */
		
		// Create a random ID
		ID = UUID.randomUUID().toString();
	}

	public static ClassSingleton getInstance() {
		if (single == null)
			single = new ClassSingleton();
		return single;
	}
	
	public String getID() {
		return this.ID;
	}
}

public class Singleton {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassSingleton s = ClassSingleton.getInstance();
		System.out.println(s.getID());
	}
}
