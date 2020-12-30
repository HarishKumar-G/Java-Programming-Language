/*
 * Java program to illustrate working of local inner classes
 */

public class Working_Of_Local_Inner_Classes
{
	private void getValue() {
		/*
		 * Note that local variable(sum) must be final till JDK7
		 * hence this code will work only in JDK8
		 */
		int sum = 20;
		
		// local inner class inside method
		class Inner 
		{
			public int divisor;
			public int remainder;
			
			public Inner() {
				divisor = 4;
				remainder = sum%divisor;
			}
			
			private int getDivisor() {
				return divisor;
			}
			private int getRemainder() {
				return sum%divisor;
			}
			private int getQuotient() {
				System.out.println("Inside inner class");
				return sum/divisor;
			}
		}
		
		Inner inner = new Inner();
		System.out.println("divisor = " + inner.getDivisor());
		System.out.println("remainder = " + inner.getRemainder());
		System.out.println("quotient = " + inner.getQuotient());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Working_Of_Local_Inner_Classes outer = new Working_Of_Local_Inner_Classes();
		outer.getValue();
	}
}
