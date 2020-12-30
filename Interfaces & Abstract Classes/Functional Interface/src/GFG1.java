/*
 * JAVA program to demonstrate the implementation of functional interface using lambda expressions
 */

public class GFG1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// lambda expression to create the object
		
		new Thread(
		()->{
			System.out.println("New Thread Created");
		}).start();
	}
}
