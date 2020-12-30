
public class Example5 {
	
	void display()
	{
		this.show();
		System.out.println("Inside display function");
	}
	
	void show() {
		System.out.println("Inside show function");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example5 t1 = new Example5();
		t1.display();
	}
}

