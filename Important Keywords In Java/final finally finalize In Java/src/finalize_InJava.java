
public class finalize_InJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("ARR");
		s = null;
		
		// Requesting JVM to call Garbage Collector In Java
		System.gc();
		System.out.println("main completes");
	}
	
	// Here overriding finalize method
	public void finalize() {
		System.out.println("finalize method overriden");
	}
}
