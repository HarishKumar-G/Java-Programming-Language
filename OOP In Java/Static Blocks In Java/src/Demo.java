/* program to demonstrate static blocks are executed before constructors */

class Main1 {
	static int i;
	int j;
	
	static {
		i = 10;
		System.out.println("Static block called");
	}
	Main1(){
		System.out.println("Constructor called");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Although we have two objects static block is executed only once
		Main1 obj1 = new Main1();
		Main1 obj2 = new Main1();
	}

}
