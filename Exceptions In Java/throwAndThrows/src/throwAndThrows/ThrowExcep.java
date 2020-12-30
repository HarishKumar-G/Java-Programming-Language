/*
 * Java program that demonstrates the use of throw
 */

package throwAndThrows;

public class ThrowExcep {

	static void fun() {
		try {
			throw new NullPointerException("demo");
		} catch(NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e;	// re-throwing the exception
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			fun();
		} catch(NullPointerException e) {
			System.out.println("Caught in main.");
		}
	}

}
