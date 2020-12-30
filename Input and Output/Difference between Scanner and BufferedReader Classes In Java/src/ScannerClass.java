import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int a = scn.nextInt();
		
		System.out.println("Enter a String: ");
		String b = scn.nextLine();
		
		System.out.printf("You have entered: " + a + " " + "and name as " + b);
	}
}
