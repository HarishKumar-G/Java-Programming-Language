/* Java code for using 'this' keyword to refer instance variables of the current class */

public class Main {
	
	int a, b;
	
	Main(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	void display(){
		System.out.println("a = " + a + " b = " + b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main object = new Main(10, 20);
		object.display();
	}

}
