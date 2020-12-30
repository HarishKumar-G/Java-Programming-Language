
// Java program to demonstrate working of throws

package throwAndThrows;

public class throwsExample2 {

	static void fun() throws IllegalAccessException
	{
		System.out.println("Inside fun(). ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fun();
		} catch(IllegalAccessException e) {
			System.out.println("Caught in main. ");
		}
	}
}
