
public class Final_Arrays2 {

	int p = 20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final Final_Arrays2 t1 = new Final_Arrays2();
		Final_Arrays2 t2 = new Final_Arrays2();
		
		// Compiler Error: can not assign value to a final variable
//		t1 = t2;
		System.out.println(t1.p);
	}
}

/* 
 * So a final array means that the array variable which is actually a reference 
 * to an object, cannot be changed to refer to anything else, but the members of array 
 * can be modified. 
 * */