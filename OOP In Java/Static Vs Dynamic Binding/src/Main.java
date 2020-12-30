
public class Main {
	
	public static class SuperClass {
		static void print() {
			System.out.println("print in superclass");
		}
	}
	
	public static class SubClass extends SuperClass {
		static void print(){
			System.out.println("print in subclass");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperClass A = new SuperClass();
		SuperClass B = new SubClass();
		
		// SubClass B = new SubClass();
		
		A.print();
		B.print();
	}
}
