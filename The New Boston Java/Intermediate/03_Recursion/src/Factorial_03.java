
public class Factorial_03 {
	
	public static void main(String args[]) {
		System.out.println(fact(5));
	}
	
	public static long fact(long num) {
		if (num <= 1)
			return 1;
		else
			return num * fact(num - 1);
	}
}
