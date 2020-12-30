
public class finally_InJava {
	
	static void A() {
		try {
			System.out.println("Inside A()");
			throw new RuntimeException("Demo");
		} finally {
			System.out.println("A's finally");
		}
	}
	
	static void B() {
		try {
			System.out.println("Inside B()");
			return;
		} finally {
			System.out.println("B's finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A();
		} catch(Exception e) {
			System.out.println("Exception caught");
		}
		B();
	}
}
