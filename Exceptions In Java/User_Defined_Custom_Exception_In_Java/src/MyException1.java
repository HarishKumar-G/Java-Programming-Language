/*
 * A class that represents use-defined exceptions
 */

public class MyException1 extends Exception { }

// A class that uses above MyException1
class setText
{
	public static void main(String args[])
	{
		try
		{
			// Throw an object of user defined exception
			throw new MyException1();
		} catch (MyException1 ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
