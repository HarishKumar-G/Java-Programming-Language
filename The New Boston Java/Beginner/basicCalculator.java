import java.util.Scanner;

class apples {
	public static void main(String args[]){
		double fnum, snum, answer;

		Scanner bucky = new Scanner(System.in);
		System.out.println("Enter first number: ");
		fnum = bucky.nextDouble();

		System.out.println("Enter second number: ");
		snum = bucky.nextDouble();

		answer = fnum + snum;
		System.out.println(answer);
	}
}