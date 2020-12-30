class Test{
	private int value = 10;
	
	void method(){
		int value = 40;
		
		System.out.println("Value of instance variable: "+ this.value);
		System.out.println("Value of local variable: " + value);
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test obj = new Test();
		obj.method();
	}
}
