/*
 * A java program to demonstrate that we can avoid NullPointerException
 */
public class AvoidNullPointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Initializing String variable with null value
		String ptr = null;
		
		// checking if ptr is null using try catch
		try
		{
			if ("gfg".equals(ptr))
				System.out.println("Same");
			else
				System.out.println("Not Same");
		}
		catch (NullPointerException e)
		{
			System.out.println("Caught NullPointerException");
		}
	}

}
