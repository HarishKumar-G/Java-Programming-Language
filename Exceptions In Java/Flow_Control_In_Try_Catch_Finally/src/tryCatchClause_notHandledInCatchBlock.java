/* 
 * Java program to demonstrate control flow of try-catch clause when exception occurs in try block 
 * but not handled in catch block.
 * 
 */

public class tryCatchClause_notHandledInCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[4];
		try
		{
			int i = arr[4];
			
			// this statement will never execute as exception is raised by above statement
			System.out.println("Inside try block");
		}
		
		// not a appropriate handler
		catch (NullPointerException ex){
			System.out.println("Exception has been caught");
		}

		// rest program will not execute
		System.out.println("Outside try-catch clause");
	}
}
