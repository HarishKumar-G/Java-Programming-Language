
public class JavaFormatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		System.out.printf("Printing Simple Integer: x = %d\n", x);
		System.out.printf("Formatted with precision: PI = %.2f\n", Math.PI);
		
		float n = 5.2f;
		System.out.printf("Formatted to specific width: n = %.4f\n", n);
		
		n = 2324435.3f;
		System.out.printf("Formatted to right margin: n = %20.4f\n" , n);
	}
}
