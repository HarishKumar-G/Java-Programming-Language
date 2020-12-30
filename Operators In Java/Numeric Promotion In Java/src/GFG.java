
/* According to Java Language Specification Section 15.25, the conditional operator will implement numeric 
 * type promotion if there are two different types as 2nd and 3rd operand */

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o1 = true ? new Integer(4) : new Float(2.0);
		System.out.println(o1);
		
		Object o2;
		if(true)
			o2 = new Integer(4);
		else
			o2 = new Float(2.0);
		System.out.println(o2);
	}
}
