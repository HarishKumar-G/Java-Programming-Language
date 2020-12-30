// Example to illustrate finally in case where 
// exceptions do not occur in the program

public class finally_InJava_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 55;
		try {
			System.out.println("In try block");
			int z = k / 55;
		}
		catch (ArithmeticException e) {
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}
		finally {
			System.out.println("Executes whether exception occurs or not");
		}
	}
}
