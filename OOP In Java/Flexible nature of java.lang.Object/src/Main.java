import java.io.InputStreamReader;

/* Java program to illustrate the flexible nature of java.lang.Object */

public class Main {

	/* *
	 * java.lang.Object is a super class to all other classes. Hence a reference variable 
	 * of type Object can be practically used to refer objects of any class 
	 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object y;
		
		y = 'A';
		System.out.println(y.getClass().getName());
		
		y = 1;
		System.out.println(y.getClass().getName());
		
		y = "halo";
		System.out.println(y.getClass().getName());
		
		y = 1.222;
		System.out.println(y.getClass().getName());
		
		y=false;
		System.out.println(y.getClass().getName());
		
		y = new InputStreamReader(System.in);
		System.out.println(y.getClass().getName());
	}
}
