/* Java program to demonstrate working of method overloading */

public class Main {
	
	public int Sum(int x, int y){
		return(x + y);
	}
	
	public int Sum(int x, int y, int z){
		return(x + y+ z);
	}
	
	private double Sum(double x, double y){
		return(x + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main s = new Main();
		System.out.println(s.Sum(10, 20));
		System.out.println(s.Sum(10, 20, 30));
		System.out.println(s.Sum(10.5, 20.5));
	}
}
