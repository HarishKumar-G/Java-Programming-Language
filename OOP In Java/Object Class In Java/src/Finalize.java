
public class Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalize t = new Finalize();
		System.out.println(t.hashCode());
		
		t = null;
		
		// Calling Garbage Collector 
		System.gc();
		System.out.println("end");
	}
	
	@Override
	protected void finalize(){
		System.out.println("finalize method called");
	}
}
