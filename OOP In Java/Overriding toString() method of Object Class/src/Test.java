class Complex1 {
	private double re, im;
	
	public Complex1(double re, double im){
		this.re = re;
		this.im = im;
	}
	
	@Override
	// returns the String representation of this complex number
	// the format of string is "Re + iIm", where Re is the Real part and Im is the imaginary part
	public String toString(){
		return String.format(re + " + i" + im);
	}
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex1 c1 = new Complex1(10, 15);
		System.out.println(c1);
	}
}
