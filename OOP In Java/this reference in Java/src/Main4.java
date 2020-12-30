/* Using 'this' as a method parameter */

public class Main4 {
	int a, b;
	
	Main4(){
		a = 10; b = 20;
	}
	
	void display(Main4 obj){
		System.out.println("a = " + a + " b = " + b);
	}
	
	void get() {
		display(this);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main4 obj = new Main4();
		obj.get();
	}

}
