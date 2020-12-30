class Box {
	double width;
	double height;
	double depth;
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box();
		
		// reference is being copied to b2
		Box b2 = b1;
		
		System.out.println(b1.height);
		System.out.println(b2.height);
		
		b2.height = 20;
		
		System.out.println(b1.height);
		System.out.println(b2.height);
	}

}
