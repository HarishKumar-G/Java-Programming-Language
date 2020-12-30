class Outer {
	// Simple nested inner class
	class Inner {
//		public static void show() {
		public void show() {
			System.out.println("In a nested class method");
		}
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer.Inner in = new Outer().new Inner();
		in.show();
	}
}
