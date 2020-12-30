
public class finalize_InJava_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finalize_InJava_04 obj = new finalize_InJava_04();
		obj = null;
		
		System.gc();
		System.out.println("main completes");
	}
	
	public void finalize() {
		System.out.println("finalize method overriden");
		System.out.println(10 / 0);
	}

}
