// Java program to illustrate Serializable Interface

import java.io.*;

/*
 * By implementing Serializable interface we make sure that state of instances of class A can be saved in a file
 */

class C implements Serializable
{
	int i;
	String s;
	
	public C(int i, String s) {
		this.i = i;
		this.s = s;
	}
}

public class Serializable_Interface {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		A a = new A(20, "GeeksForgeeks");
		
		// Serializing 'a'
		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a);
		
		// De-serialzing 'a'
		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		A b = (A)ois.readObject();  //down-casting object
		
		System.out.println(b.i + " " + b.s);
		
		// closing-streams
		oos.close();
		ois.close();
	}
}
