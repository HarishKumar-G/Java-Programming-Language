
class Complex1 {
	private double re, im;
	
	public Complex1(double re, double im){
		this.re = re;
		this.im = im;
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			System.out.println("if(o == this) is true");
			return true;
		}
		
		if(!(o instanceof Complex1)) {
			System.out.println("(o instanceof Complex1) is true");
			return false;
		}
		
		Complex1 c = (Complex1) o;
		
		return Double.compare(re, c.re) == 0 && Double.compare(im, c.im) == 0;
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Complex1 c1 = new Complex1(10, 15); 
	        Complex1 c2 = new Complex1(10, 15); 
	        if (c1.equals(c2)) { 
	            System.out.println("Equal "); 
	        } else { 
	            System.out.println("Not Equal "); 
	        }
	}
}
