
public class MethodLevel {

	static int x = 11;
	private int y = 33; 
	
	public void method(int x)
	{
		MethodLevel t = new MethodLevel();
		t.x = 22;
		y = 44;
		
		System.out.println("MethodLevel.x = " + MethodLevel.x);
		System.out.println("t.x = " + t.x);
		System.out.println("t.y = " + t.y);
		System.out.println("y = " + y);
		
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(t.y));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLevel t = new MethodLevel();
		t.method(5);
	}

}
