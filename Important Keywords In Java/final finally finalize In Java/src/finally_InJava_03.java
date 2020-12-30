/* Exception occurs and corresponding catch block matters */

public class finally_InJava_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 66;
		try {
			System.out.println("In try block");
			int z = k / 0;
			System.out.println("Flow doesn't came here");
		}
		catch (ArithmeticException e){
			System.out.println("In catch block");
			System.out.println("Dividing by zero but caught");
		}
		finally {
			System.out.println("Executes whether an exception occurs or not");
		}
	}
}
