/**
 * Java program to demonstrate toString method
 */

/**
 * @author nxf53632
 *
 */
public class toStringMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int a = 20/0;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
