// Java program to illustrate final keyword

public class Example2 {

	// by default it is final
	void h() {}
	
	// by default it is not final
	static int j = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// see modified contents of variable j
		j = 36;
		System.out.println(j);
	}
}
