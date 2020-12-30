
public class finalize_InJava_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finalize_InJava_02 m = new finalize_InJava_02();
		
		// Calling finalize method explicitly
		m.finalize();
		m.finalize();
		m = null;
		
		// Requesting JVM to call Garbage Collector
		System.gc();
		System.out.println("Main Completes");
	}
	
	// Here overriding finalize method
	public void finalize() {
		System.out.println("finalize method overriden");
	}
}
