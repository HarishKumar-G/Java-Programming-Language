/*
 * A class that represents user defined exceptionss
 */
class CreateException extends Exception {

	public CreateException(String s) {
		// Call constructor of parent Exception
		super(s);
	}
}

public class MyException {
	public static void main(String args[]) {
		try
		{
			// throw an object of user defined exception
			throw new CreateException("GeeksForGeeks");
		}
		catch (CreateException ex) {
			System.out.println("Caught");
			// Print the message from MyException Object
			System.out.println(ex.getMessage());
		}
	}
}
