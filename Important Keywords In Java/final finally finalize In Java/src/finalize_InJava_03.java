
public class finalize_InJava_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		finalize_InJava_03 obj = new finalize_InJava_03();
		
		obj.finalize();
		obj = null;
		
		System.gc();
		System.out.println("Main Completes");
	}
	
	public void finalize() {
		System.out.println("finalize method overriden");
		System.out.println(10 / 0);
	}
}
