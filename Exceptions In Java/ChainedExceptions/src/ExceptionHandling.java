/*
 * Java program to demonstrate working of chained exceptions
 */

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			// creating an exception
			NumberFormatException ex = new NumberFormatException("Exception");
			
			// setting a cause of the exception
			ex.initCause(new NullPointerException("This is actual cause of the exception"));
			
			// throwing an exception with cause
			throw ex;
		}
		
		catch (NumberFormatException ex) {
			// displaying the exception
			System.out.println(ex);
			
			// getting the actual cause of exception
			System.out.println(ex.getCause());
		}
	}

}
