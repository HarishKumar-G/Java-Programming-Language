// Java program to demonstrate PrintStackTrace() method

public class Bucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			int a = 20/0;
		} catch (Exception e) {
			// printStackTrace method
			// prints line numbers + call
			e.printStackTrace();
			
			// prints what exception has
			System.out.println(e);
		}
	}
}
