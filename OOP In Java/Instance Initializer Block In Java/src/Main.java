/* Java Program to illustrate Instance Initializer Block */

public class Main {
	
	// Instance initializer block starts...
	{
		System.out.println("IIB Block");		
	}
	
	Main(){
		System.out.println("Constructor block called");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Main obj = new Main();
	}

}
