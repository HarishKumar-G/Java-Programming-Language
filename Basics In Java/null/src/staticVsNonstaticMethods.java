
public class staticVsNonstaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVsNonstaticMethods obj = null;
	
		obj.staticMethod();
		obj.nonStaticMethod();
	}
	
	private static void staticMethod(){
		System.out.println("static method: can be called by null reference.");
	}
	
	private void nonStaticMethod(){
		System.out.println("nonStaticMethod: can not be called by null reference.");
	}
}
