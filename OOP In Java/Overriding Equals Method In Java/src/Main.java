
/* The reason for printing Not Equal is simple. When we compare c1 and c2, it is checked whether 
 * both c1 and c2 refer to the same object or not */

class Complex {
	@SuppressWarnings("unused")
	private double re, im;
	
	public Complex(double re, double im){
		this.re = re;
		this.im = im;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1 = new Complex(10, 15);
		Complex c2 = new Complex(10, 15);
		
		if (c1 == c2){
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}
}
