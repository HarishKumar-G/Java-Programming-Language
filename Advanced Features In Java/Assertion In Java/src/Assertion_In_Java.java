/*
 * Java program to demonstrate syntax of assertion
 */
import java.util.Scanner;

public class Assertion_In_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 15;
		assert value >= 20 : " Underweight";
		System.out.println("value is " + value);
	}
}
