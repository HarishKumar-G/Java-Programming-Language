/* Java program to demonstrate working of getClass() */

public class GetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj = new String("GeeksForGeeks");
		Class c = obj.getClass();
		System.out.println("The class of Object obj is : " + c.getName());
	}
}
