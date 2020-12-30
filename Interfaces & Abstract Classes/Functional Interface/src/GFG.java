/*
 * JAVA Program to demonstrate functional interface
 */

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create anonymous inner class Object
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("New Thread Created");
			}
		}).start();
	}
}
