class Test {
	void show(){
		System.out.println("Test::show() called");
	}
}

public class AllocatingMemForObjects {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/**
	 * 	Test t;
		t.show();	// Error here because t is not initialized
	 *
	 **/	
		
		Test t = new Test();	
		t.show();	// will work fine
	}

}
