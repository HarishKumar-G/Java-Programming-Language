
public class Main {

	// Initializer block starts...
	{
		// 
		System.out.println("common parts of constructors invoked!!");
	}
	
	public Main(){
		System.out.println("Default constructor invoked");
	}
	
	public Main(int x){
		System.out.println("Parameterized constructor is invoked");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj1, obj2;
		
		obj1 = new Main();
		obj2 = new Main(1);
	}
}
