/* Java program to illustrate Instance Initialization Block with super() */

class B {
	B() {
		System.out.println("B-constructor called");
	}
	{
		System.out.println("B-IIB block");
	}
}


public class Main2 extends B {
	
	Main2(){
		super();
		System.out.println("A-constructor called");
	}
	{
		System.out.println("A-IIB block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		Main2 a = new Main2();
	}
}
