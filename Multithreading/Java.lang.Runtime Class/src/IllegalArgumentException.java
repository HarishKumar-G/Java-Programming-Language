/*
 * Java program to illustrate Process exec() method of Runtime class
 */

public class IllegalArgumentException {
	public static void main(String[] args) {
		try {
			// create a process and execute google-chrome
			Process process = Runtime.getRuntime().exec("jcshell.bat");
			System.out.println("JCShell successfully started");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
