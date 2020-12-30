/* Java program to demonstrate user defined exception */
/* This program throws an exception whenever balance amount is below Rs 1000 */

public class UserDefinedExceptions extends Exception {

		// TODO Auto-generated method stub
		private static int accNo[] = {1001, 1002, 1003, 1004};
		private static String name[] = {"Nish", "Shubh", "Abhi", "Akash", "Sush"};
		private static double bal[] = {10000.00, 12000.00, 5600.0, 999.00, 1100.55};
		
		// default constructor
		UserDefinedExceptions() { }
		UserDefinedExceptions(String str) { super(str); }
		
		// write main() 
		public static void main(String[] args) {
			try {
				// display heading for the table
				System.out.println("ACCNO" + "\t" + "CUSTOMER" + "\t" + "BALANCE");
				
				// display the actual account information
				for (int i = 0; i < 5; i++)
				{
					System.out.println(accNo[i] + "\t" + name[i] + "\t\t" + bal[i]);
					
					// display own exception if balance < 1000
					if (bal[i] < 1000) {
						UserDefinedExceptions me = new UserDefinedExceptions("Balance is less than 1000");
						throw me;
					}
				}
			}   // end of try
			
			catch (UserDefinedExceptions e) {
				e.printStackTrace();
		}
	}
}
