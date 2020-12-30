// Java program to demonstrate getMessage method

public class java_Lang_Throwable_getMessage_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 20/0;
		} catch (Exception e) {
			// getMessage method
			// Prints only the message of exception and not the name of exception
			System.out.println(e.getMessage());
			
			// Prints what exception has been thrown
			// System.out.println(e);
			}
		}
}
