
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		final int b = 6;
		
		// modifying the non final variable : Allowed
		a++;
		
		//modifying the final variable immediately gives the compile time error
//		b++;
	}
}
