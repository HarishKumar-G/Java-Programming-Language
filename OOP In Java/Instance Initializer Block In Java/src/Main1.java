/* Java program to illustrate multiple Instance Initializer Blocks in Java */

public class Main1 {
	// Instance Initialization Block - 1
	{
		System.out.println("IIB1 Block");
	}
	// Instance Initialization Block - 2
	{
		System.out.println("IIB2 Block");
	}
	// Constructor for Main1
	Main1(){
		System.out.println("Constructor Block is called");
	}
	// Instance Initialization Block - 3
	{
		System.out.println("IIB3 Block");
	}
	
	// main functions
	public static void main(String args[]){
		@SuppressWarnings("unused")
		Main1 obj = new Main1();
	}
}
