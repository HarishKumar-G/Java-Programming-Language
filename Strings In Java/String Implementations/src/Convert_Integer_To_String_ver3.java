/* convert using Integer(int).toString() */

public class Convert_Integer_To_String_ver3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d = 1234;
		/*	Integer obj = new Integer(d);
			String str4 = obj.toString();
		
		(or)
		
			String str4 = new Integer(d).toString();
		(or)
			String str4 = new Integer(1234).toString();
		*/
		
		String str4 = new Integer(d).toString();
		System.out.println("Strign str4 = " + str4);
	}
}
