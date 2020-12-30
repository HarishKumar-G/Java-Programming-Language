/*
 * Java program to illustrate freeMemory() method of Runtime class
 * 
 * freeMemory(): This method returns the amount of free memory in the JVM (Java Virtual Machine)
 */

public class freeMemory_Example2 {

	public static void main(String[] args) {
		// print the number of free bytes
		System.out.println(" " + Runtime.getRuntime().freeMemory());
	}
}
