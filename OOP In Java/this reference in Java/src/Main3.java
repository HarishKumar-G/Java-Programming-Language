/* Java code for using "this" keyword to return the current class instance */

public class Main3 {
	
	int a, b;
	
	Main3(){
		a = 10;
		b = 20;
	}
	
	Main3 get(){
		return this;
	}
	
	void display(){
		System.out.println("a = " + a + " b = " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main3 obj = new Main3();
		
		obj.get().display();
	}
}
